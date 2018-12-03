package com.tabeldata.springhibernateexample;

import com.tabeldata.springhibernateexample.entity.Deposito;
import com.tabeldata.springhibernateexample.entity.Nasabah;
import com.tabeldata.springhibernateexample.repository.DepositoDao;
import com.tabeldata.springhibernateexample.repository.NasabahDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class SpringHibernateExampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringHibernateExampleApplication.class, args);

        NasabahDao nasabahDao = applicationContext.getBean(NasabahDao.class);
        DepositoDao depositoDao = applicationContext.getBean(DepositoDao.class);

        Nasabah n001 = nasabahDao.save(
                new Nasabah(
                        "001",
                        "Dimas Maryanto",
                        "bukit indah no b8",
                        Date.valueOf(LocalDate.now()),
                        false,
                        new BigDecimal(0),
                        0d,
                        1,
                        Timestamp.valueOf(LocalDateTime.now())
                ));

        Deposito deposito = new Deposito(
                null,
                n001,
                3,
                BigDecimal.ZERO,
                BigDecimal.ZERO,
                BigDecimal.ZERO);
        Deposito d1 = depositoDao.save(deposito);

        Optional<Deposito> dep1 = depositoDao.findById(d1.getId());
        log.info("deposito new --> : {}", dep1.get());

    }
}
