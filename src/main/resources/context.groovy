import org.springframework.context.support.ReloadableResourceBundleMessageSource
import ru.homework.configure.configure.DataBase
import ru.homework.configure.groovy.GroovyConnector

beans {
    db ReloadableResourceBundleMessageSource, {
        defaultEncoding = 'utf-8'
        basename = 'db'
    }

    dataBase DataBase
    connector GroovyConnector, ref(db), ref(dataBase)
}