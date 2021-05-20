package ru.homework.configure.configure;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

@Getter
@Setter
@RequiredArgsConstructor
public class DataBase {
    private final String login;
    private final String password;

    public DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:memory:myDb?cache=shared");
        return dataSource;
    }
}
