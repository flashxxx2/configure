package ru.homework.configure.programmatic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProgrammaticConnector {

    private String login;
    private String password;
    private final DataBase ds;

}
