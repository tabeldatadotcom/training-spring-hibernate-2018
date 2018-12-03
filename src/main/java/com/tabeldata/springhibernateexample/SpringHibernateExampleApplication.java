package com.tabeldata.springhibernateexample;

import com.tabeldata.springhibernateexample.entity.Nasabah;
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

//        NasabahDao bean = applicationContext.getBean(NasabahDao.class);
//        bean.save(new Nasabah(
//                "001",
//                "Dimas Maryanto",
//                "bukit indah no b8",
//                Date.valueOf(LocalDate.now()),
//                false,
//                new BigDecimal(0),
//                0d,
//                1,
//                Timestamp.valueOf(LocalDateTime.now()))
//        );
//
//        bean.save(new Nasabah(
//                "002",
//                "Dimas Maryanto",
//                "bukit indah no b8",
//                Date.valueOf(LocalDate.now()),
//                false,
//                new BigDecimal(0),
//                0d,
//                1,
//                Timestamp.valueOf(LocalDateTime.now()))
//        );
//
//        Optional<Nasabah> nasabahBaru = bean.findById("001");
//        Nasabah n001 = nasabahBaru.get();
//        log.info("nasabah id = 001 : {}", n001);
//
//        Iterable<Nasabah> list = bean.findAll();
//        for (Nasabah nasabah : list) {
//            log.info("{}", nasabah);
//        }
//
//        bean.deleteById("002");
    }
}
