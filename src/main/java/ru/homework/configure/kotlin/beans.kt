package ru.homework.configure.kotlin

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.context.support.beans
import org.springframework.core.io.ClassPathResource

val beans = beans {
    bean<KotlinConnector>("kotlinConnector")
    bean<DataBase>("dataBase")
    bean("propertySourcesPlaceholderConfigurer") {
        PropertySourcesPlaceholderConfigurer().apply {
            setLocation(ClassPathResource("db.properties"))
        }
    }
}