package ru.homework.configure.xml;

import lombok.Getter;
import ru.homework.configure.configure.DataBase;

@Getter
public class XMLSQLiteConnector {

    private final DataBase ds;

    public XMLSQLiteConnector(DataBase ds) {
        this.ds = ds;
    }
}
