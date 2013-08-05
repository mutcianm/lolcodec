package com.lolcode.generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/29/13
 * Time: 6:10 PM
 */
public class LLVMGenerator {
    IRModule root;
    BufferedWriter out;


    public LLVMGenerator(IRModule root) throws IOException {
        this.root = root;
        out = new BufferedWriter(new FileWriter(root.name));
    }

    private void writeNotab(String... args) {
        for (String arg : args) {
            try {
                out.write(arg);
            } catch (IOException e) {
                System.err.print(e);
            }
        }
    }

    private void write(String... args) {
        try {
            out.write("\t");
        } catch (IOException e) {
            System.out.print(e);
        }
        writeNotab(args);
    }

    private void writeBinOp(IRBinOp binOp) {
        switch (binOp.opType) {
            case SUM:
            case SUB:
            case MUL:
            case DIV:
                write(binOp.result.toString(),
                        " = ",
                        binOp.call.toString());
                break;
        }
    }

    private void writeBlock(IRBlock block) {
        switch (block.blkType) {
            case ALLOC:
                break;
            case LOAD:
                break;
            case STORE:
                break;
            case CALL:
                write(block.toString());
                break;
            case BINOP:
                writeBinOp((IRBinOp) block);
                break;
            case BR:
                break;
            case SWITCH:
                break;
            case LABEL:
                break;
            case RET:
                break;
        }
    }

    private void writeFunction(IRFunction func) {
        writeNotab("; Function Attrs: nounwind uwtable\n");
        writeNotab("define %struct.lolvariable* @");
        write(func.name);
        for (int i = 0; i < func.args.size(); ++i) {
            writeNotab("%struct.lolvariable* ");
            writeNotab(func.args.get(i).toString());
            if (i < (func.args.size() - 1))
                writeNotab(", ");
        }
        writeNotab(") {\n");

        writeNotab("}\n\n");
    }

    private void writeStringTable() {

    }

    private void writeHeader() {
        writeNotab("; ModuleId = ", root.name, "\n");
        //TODO: get and write target datalayout and triple
        writeNotab("%struct.lolvariable = type { i32, %union.value }\n");
        writeNotab("%union.value = type { i8* }\n");
    }

    public void generate() {
        writeHeader();
        writeStringTable();
        for (IRFunction func : root.functions) {
            writeFunction(func);
        }
    }
}
