package com.tabeldata.springhibernateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringHibernateExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateExampleApplication.class, args);
    }
}
