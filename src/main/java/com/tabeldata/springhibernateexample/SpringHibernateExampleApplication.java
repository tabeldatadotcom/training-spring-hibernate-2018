package com.tabeldata.springhibernateexample;

import com.tabeldata.springhibernateexample.entity.Nasabah;
import com.tabeldata.springhibernateexample.repository.NasabaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
@EnableJpaRepositories
public class SpringHibernateExampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringHibernateExampleApplication.class, args);

        NasabaRepository bean = applicationContext.getBean(NasabaRepository.class);
        bean.save(new Nasabah(
                "001",
                "Dimas Maryanto",
                "bukit indah no b8",
                Date.valueOf(LocalDate.now()),
                false,
                new BigDecimal(0),
                0d,
                1,
                Timestamp.valueOf(LocalDateTime.now()))
        );
    }
}
