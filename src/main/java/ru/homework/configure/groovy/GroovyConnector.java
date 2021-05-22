package ru.homework.configure.groovy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GroovyConnector {

    private final String login;
    private final String password;
    private final DataBase ds;

}
