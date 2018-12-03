package com.tabeldata.springhibernateexample.repository;

import com.tabeldata.springhibernateexample.entity.TransactionDeposito;
import org.springframework.data.repository.CrudRepository;

public interface TransaksiDepositoRepository extends CrudRepository<TransactionDeposito, String> {
}
