package com.lolcode;

import java.util.ArrayList;
import java.util.List;

public class BaseCompilerSettings implements CompilerSettings {
    private boolean disableWarnings = false;
    private String outputClassPath = "";
    private String outputDir = "./";
    private boolean createJar = false;
    private List<String> inputFiles = new ArrayList<>();
    private String jarMainClass;
    private String outJarFile;

    @Override
    public void verify() {
        if (createJar && jarMainClass == null)
            throw new RuntimeException("Entrypoint class not specified for jar file");
    }

    @Override
    public boolean isDisableWarnings() {
        return disableWarnings;
    }

    @Override
    public void setDisableWarnings(boolean disableWarnings) {
        this.disableWarnings = disableWarnings;
    }

    @Override
    public String getOutputClassPath() {
        return outputClassPath;
    }

    @Override
    public void setOutputClassPath(String outputClassPath) {
        if (outputClassPath.equals("."))
            return;
        this.outputClassPath = outputClassPath.replace('.', '/');
        if (!this.outputClassPath.endsWith("/")) {
            this.outputClassPath += '/';
        }
    }

    @Override
    public String getOutputDir() {
        return outputDir;
    }

    @Override
    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
        if (!this.outputDir.endsWith("/")) {
            this.outputDir += "/";
        }
    }

    @Override
    public boolean isCreateJar() {
        return createJar;
    }

    @Override
    public void setCreateJar(boolean createJar) {
        this.createJar = createJar;
    }

    @Override
    public List<String> getInputFiles() {
        return inputFiles;
    }

    @Override
    public void setInputFiles(List<String> inputFiles) {
        this.inputFiles = inputFiles;
    }

    @Override
    public void addInputFile(String filename) {
        inputFiles.add(filename);
    }

    @Override
    public void setJarMainClass(String className) {
        jarMainClass = className;
    }

    @Override
    public String getJarMainClass() {
        return jarMainClass;
    }

    @Override
    public void setOutputJarFile(String name) {
        outJarFile = name;
    }

    @Override
    public String getOutputJarFile() {
        return outJarFile;
    }
}
