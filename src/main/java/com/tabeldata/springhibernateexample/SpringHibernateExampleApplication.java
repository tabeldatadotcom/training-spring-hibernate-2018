package com.tabeldata.springhibernateexample;

import com.tabeldata.springhibernateexample.entity.Deposito;
import com.tabeldata.springhibernateexample.entity.Nasabah;
import com.tabeldata.springhibernateexample.entity.TransactionDeposito;
import com.tabeldata.springhibernateexample.repository.DepositoDao;
import com.tabeldata.springhibernateexample.repository.NasabahDao;
import com.tabeldata.springhibernateexample.repository.TransaksiDepositoDao;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class SpringHibernateExampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringHibernateExampleApplication.class, args);

        NasabahDao nasabahDao = applicationContext.getBean(NasabahDao.class);
        DepositoDao depositoDao = applicationContext.getBean(DepositoDao.class);
        TransaksiDepositoDao transaksiDao = applicationContext.getBean(TransaksiDepositoDao.class);

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

        List<TransactionDeposito> listTransaksi = new ArrayList<>();

        TransactionDeposito trans1 = new TransactionDeposito(null,
                Timestamp.valueOf(LocalDateTime.now()),
                new BigDecimal(10000000),
                BigDecimal.ZERO,
                new BigDecimal(10000000)
        );
        trans1 = transaksiDao.save(trans1);

        TransactionDeposito trans2 = new TransactionDeposito(null,
                Timestamp.valueOf(LocalDateTime.now()),
                new BigDecimal(10000000),
                BigDecimal.ZERO,
                new BigDecimal(20000000)
        );
        trans2 = transaksiDao.save(trans2);

        TransactionDeposito trans3 = new TransactionDeposito(null,
                Timestamp.valueOf(LocalDateTime.now()),
                new BigDecimal(10000000),
                BigDecimal.ZERO,
                new BigDecimal(30000000)
        );
        trans3 = transaksiDao.save(trans3);

        listTransaksi.add(trans1);
        listTransaksi.add(trans2);
        listTransaksi.add(trans3);

        Deposito deposito = new Deposito(
                1,
                n001,
                3,
                new BigDecimal(30000000),
                listTransaksi
        );
        Deposito d1 = depositoDao.save(deposito);

        Optional<Deposito> dep1 = depositoDao.findById(d1.getId());
        Deposito deposito1 = dep1.get();
        log.info("deposito new --> : {}", deposito1);
    }
}
