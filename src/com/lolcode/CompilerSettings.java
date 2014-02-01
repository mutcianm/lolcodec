package com.lolcode;

import java.util.List;

public interface CompilerSettings {

    void verify();

    boolean isDisableWarnings();

    void setDisableWarnings(boolean disableWarnings);

    String getOutputClassPath();

    void setOutputClassPath(String outputClassPath);

    String getOutputDir();

    void setOutputDir(String outputDir);

    boolean isCreateJar();

    void setCreateJar(boolean createJar);

    List<String> getInputFiles();

    void setInputFiles(List<String> inputFiles);

    void addInputFile(String filename);

    void setJarMainClass(String className);

    String getJarMainClass();

    void setOutputJarFile(String name);

    String getOutputJarFile();
}
