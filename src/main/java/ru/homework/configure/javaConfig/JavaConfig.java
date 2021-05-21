package ru.homework.configure.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:db.properties")
public class JavaConfig {

    @Value("${login}")
    private String login;

    @Value("${password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:memory:myDb?cache=shared");
        return dataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public JavaConnector javaConnector(DataSource dataSource) {
        return new JavaConnector(login, password, dataSource);
    }
}
