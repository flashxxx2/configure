package ru.homework.configure.xml;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.sql.DataSource;

@Getter
@AllArgsConstructor
public class XMLSQLiteConnector {

    private final String login;
    private final String password;
    private final DataSource ds;

}
