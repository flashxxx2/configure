package ru.homework.configure.annotation;

import lombok.Getter;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@Getter
public class AnnotationSQLiteConnector {
    private final MessageSource db;

    private final String login;
    private final String password;
    private final MyDataBase ds;

    public AnnotationSQLiteConnector(MessageSource db, MyDataBase ds) {
        this.db = db;
        this.login = db.getMessage("login", null, Locale.getDefault());
        this.password = db.getMessage("password", null, Locale.getDefault());
        this.ds = ds;
    }
}
