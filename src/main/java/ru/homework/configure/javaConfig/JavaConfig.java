package ru.homework.configure.javaConfig;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Getter
@PropertySource("classpath:db.properties")
public class JavaConfig {

    @Value("${db.login}")
    private String login;

    @Value("${db.password}")
    private String password;

    @Bean
    public DataBase dataBase() {
        DataBase dataBase = new DataBase();
//        dataBase.setPassword(password);
//        dataBase.setLogin(login);
        return new DataBase();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
