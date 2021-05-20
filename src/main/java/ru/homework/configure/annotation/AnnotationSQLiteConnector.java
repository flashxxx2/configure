package ru.homework.configure.annotation;

import lombok.Getter;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@Getter
public class AnnotationSQLiteConnector {

    private final MyDataBase ds;

    public AnnotationSQLiteConnector(MyDataBase ds) {
        this.ds = ds;
    }
}
