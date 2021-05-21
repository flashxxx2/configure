package ru.homework.configure.kotlin;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class KotlinConnector {

    private final String login;
    private final String password;
    private final DataBase ds;
}
