package ru.homework.configure.kotlin;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class KotlinConnector {

    private final String login;
    private final String password;
    private final DataBase ds;

    public KotlinConnector(@Value("${login}") String login,
                           @Value("${password}") String password,
                           DataBase ds) {
        this.login = login;
        this.password = password;
        this.ds = ds;
    }
}
