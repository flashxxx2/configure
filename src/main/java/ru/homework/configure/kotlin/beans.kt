package ru.homework.configure.kotlin

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.context.support.beans

val beans = beans {
    bean<KotlinConnector>()
    bean<DataBase>()
    bean("propertySourcesPlaceholderConfigurer") {
        PropertySourcesPlaceholderConfigurer().apply {
            setPropertySources()
        }
    }
}