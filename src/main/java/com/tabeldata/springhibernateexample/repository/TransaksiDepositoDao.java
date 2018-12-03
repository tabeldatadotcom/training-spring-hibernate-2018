package com.tabeldata.springhibernateexample.repository;

import com.tabeldata.springhibernateexample.entity.TransactionDeposito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransaksiDepositoDao {

    @Autowired
    private TransaksiDepositoRepository repository;

    public TransactionDeposito save(TransactionDeposito trans){
        return repository.save(trans);
    }

    public Iterable<TransactionDeposito> save(List<TransactionDeposito> list){
        return repository.saveAll(list);
    }
}
