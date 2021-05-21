package ru.homework.configure.xml;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.sql.DataSource;

@Getter
@RequiredArgsConstructor
public class XMLSQLiteConnector {

    private final String login;
    private final String password;
    private final DataSource ds;

}
