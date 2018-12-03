package com.tabeldata.springhibernateexample.repository;

import com.tabeldata.springhibernateexample.entity.Deposito;
import org.springframework.data.repository.CrudRepository;

public interface DepositoJpaRepository extends CrudRepository<Deposito, Integer> {
}
