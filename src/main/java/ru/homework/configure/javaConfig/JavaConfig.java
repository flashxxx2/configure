package ru.homework.configure.javaConfig;

import lombok.val;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

@Configuration
public class JavaConfig {

    @Bean
    public DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:memory:myDb?cache=shared");
        return dataSource;
    }

    @Bean
    public MessageSource db() {
        val messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("db");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
