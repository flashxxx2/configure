package ru.homework.configure.javaConfig;

import lombok.Getter;
import org.springframework.context.MessageSource;
import ru.homework.configure.configure.DataBase;

import java.util.Locale;

@Getter
public class JavaConnector {

    private final MessageSource db;

    private final String login;
    private final String password;
    private final DataBase ds;

    public JavaConnector(MessageSource db, DataBase ds) {
        this.db = db;
        this.login = db.getMessage("login", null, Locale.getDefault());
        this.password = db.getMessage("password", null, Locale.getDefault());
        this.ds = ds;
    }
}
