package ru.homework.configure.groovy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GroovyConnector {

    private final String login;
    private final String password;
    private final DataBase ds;

}
