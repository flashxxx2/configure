package ru.homework.configure.configure;

import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

public class DataBase {

    public DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:memory:myDb?cache=shared");
        return dataSource;
    }
}
