package ru.homework.configure.javaConfig;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.sql.DataSource;

@Getter
@RequiredArgsConstructor
public class JavaConnector {

    private final String login;
    private final String password;
    private final DataSource ds;
}
