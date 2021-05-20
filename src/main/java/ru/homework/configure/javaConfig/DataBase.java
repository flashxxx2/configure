package ru.homework.configure.javaConfig;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

@Getter
@Setter
public class DataBase {
    private String login;
    private String password;

    public DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:memory:myDb?cache=shared");
        return dataSource;
    }
}
