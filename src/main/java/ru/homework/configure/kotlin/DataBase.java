package ru.homework.configure.kotlin;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
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
