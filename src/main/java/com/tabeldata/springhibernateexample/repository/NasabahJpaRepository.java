package com.tabeldata.springhibernateexample.repository;

import com.tabeldata.springhibernateexample.entity.Nasabah;
import org.springframework.data.repository.CrudRepository;

public interface NasabahJpaRepository extends CrudRepository<Nasabah, String> {
}
