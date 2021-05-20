package ru.homework.configure.annotation;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;


@Getter
@Component
@PropertySource("classpath:db.properties")
public class MyDataBase {

    @Value("${db.login}")
    private String login;

    @Value("${db.password}")
    private String password;

    public DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:memory:myDb?cache=shared");
        return dataSource;
    }
}
