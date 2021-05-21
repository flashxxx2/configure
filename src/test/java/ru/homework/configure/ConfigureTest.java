package ru.homework.configure;


import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ru.homework.configure.annotation.AnnotationSQLiteConnector;
import ru.homework.configure.groovy.GroovyConnector;
import ru.homework.configure.javaConfig.JavaConfig;
import ru.homework.configure.javaConfig.JavaConnector;
import ru.homework.configure.kotlin.BeansKt;
import ru.homework.configure.kotlin.KotlinConnector;
import ru.homework.configure.programmatic.DataBase;
import ru.homework.configure.programmatic.ProgrammaticConnector;
import ru.homework.configure.xml.XMLSQLiteConnector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConfigureTest {

    @Test
    void annotationConfig() {
        val context = new AnnotationConfigApplicationContext("ru.homework.configure.annotation");
        val bean = context.getBean("annotationSQLiteConnector", AnnotationSQLiteConnector.class);
        assertNotNull(bean.getDs());
        assertEquals("user", bean.getLogin());
        assertEquals("app", bean.getPassword());
    }

    @Test
    void xmlConfig() {
        val context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context)
                .loadBeanDefinitions("context.xml");
        context.refresh();
        val bean = context.getBean("XMLSQLiteConnector", XMLSQLiteConnector.class);
        assertNotNull(bean.getDs());
        assertEquals("user", bean.getLogin());
        assertEquals("app", bean.getPassword());
    }

    @Test
    void groovyConfig() {
        val context = new GenericGroovyApplicationContext("context.groovy");
        val bean = context.getBean("connector", GroovyConnector.class);
        assertNotNull(bean.getDs());
        assertEquals("user", bean.getLogin());
        assertEquals("app", bean.getPassword());
    }

    @Test
    void programmaticConfig() {
        val context = new GenericApplicationContext();
        context.registerBean("dataBase", DataBase.class);
        context.registerBean("connector",ProgrammaticConnector.class);
        context.refresh();
        ProgrammaticConnector bean = context.getBean(ProgrammaticConnector.class);
        assertNotNull(bean.getDs());
        assertEquals("user", bean.getLogin());
        assertEquals("app", bean.getPassword());
    }

    @Test
    void javaConfig() {
        val context = new GenericApplicationContext();
        val reader = new AnnotatedBeanDefinitionReader(context);
        reader.register(JavaConfig.class);
        context.refresh();
        val bean = context.getBean("javaConnector", JavaConnector.class);
        assertNotNull(bean.getDs());
        assertEquals("user", bean.getLogin());
        assertEquals("app", bean.getPassword());
    }

    @Test
    void kotlinConfig() {
        val context = new GenericApplicationContext();
        BeansKt.getBeans().initialize(context);
        context.refresh();
        val bean = context.getBean(KotlinConnector.class);
        assertNotNull(bean.getDs());
        assertEquals("user", bean.getLogin());
        assertEquals("app", bean.getPassword());
    }
}
