package ru.homework.configure.groovy;

import lombok.Getter;
import org.springframework.context.MessageSource;
import ru.homework.configure.configure.DataBase;

import java.util.Locale;

@Getter
public class GroovyConnector {

    private final MessageSource db;

    private final String login;
    private final String password;
    private final DataBase ds;

    public GroovyConnector(MessageSource messageSource, DataBase ds) {
        this.db = messageSource;
        this.login = messageSource.getMessage("login", null, Locale.getDefault());
        this.password = messageSource.getMessage("password", null, Locale.getDefault());
        this.ds = ds;
    }
}
