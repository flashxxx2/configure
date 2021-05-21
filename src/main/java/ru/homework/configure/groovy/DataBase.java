package ru.homework.configure.groovy;

import lombok.Getter;
import lombok.Setter;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

@Getter
@Setter
public class DataBase {

    public DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:memory:myDb?cache=shared");
        return dataSource;
    }
}
