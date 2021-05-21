package ru.homework.configure.programmatic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ProgrammaticConnector {

    private String login;
    private String password;
    private final DataBase ds;

}
