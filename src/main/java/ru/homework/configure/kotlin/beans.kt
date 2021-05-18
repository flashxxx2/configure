package ru.homework.configure.kotlin

import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.context.support.beans
import ru.homework.configure.configure.DataBase

val beans = beans {
    bean<KotlinConnector>()
    bean<DataBase>()
    bean("messageSource") {
        ReloadableResourceBundleMessageSource().apply {
            setDefaultEncoding("utf-8")
            setBasename("db")
        }
    }
}