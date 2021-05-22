package ru.homework.configure.javaConfig;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.sql.DataSource;

@Getter
@AllArgsConstructor
public class JavaConnector {

    private final String login;
    private final String password;
    private final DataSource ds;
}
