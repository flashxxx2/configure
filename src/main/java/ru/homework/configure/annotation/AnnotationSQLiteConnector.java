package ru.homework.configure.annotation;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
@PropertySource("classpath:db.properties")
public class AnnotationSQLiteConnector {

    @Value("${login}")
    private String login;

    @Value("${password}")
    private String password;

    private MyDataBase ds;

    public AnnotationSQLiteConnector(MyDataBase ds) {
        this.ds = ds;
    }
}
