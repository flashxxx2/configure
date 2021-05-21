import ru.homework.configure.groovy.GroovyConnector
import ru.homework.configure.groovy.DataBase

Properties properties = new Properties()
File propertiesFile = new File(getClass().getResource('/db.properties').toURI())
propertiesFile.withInputStream {
    properties.load(it)
}
beans {
    dataSource DataBase
    connector(GroovyConnector, properties.login, properties.password, dataSource)
}