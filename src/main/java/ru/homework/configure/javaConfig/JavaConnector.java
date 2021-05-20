package ru.homework.configure.javaConfig;

import lombok.Getter;

@Getter
public class JavaConnector {

    private final DataBase ds;

    public JavaConnector(DataBase ds) {
        this.ds = ds;
    }
}
