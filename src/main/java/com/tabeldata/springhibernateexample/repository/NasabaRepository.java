package com.tabeldata.springhibernateexample.repository;

import com.tabeldata.springhibernateexample.entity.Nasabah;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NasabaRepository {

    @Autowired
   private NasabahJpaRepository repository;

    public void save(Nasabah n) {
        repository.save(n);
    }
}
