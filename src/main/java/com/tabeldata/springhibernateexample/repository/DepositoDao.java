package com.tabeldata.springhibernateexample.repository;

import com.tabeldata.springhibernateexample.entity.Deposito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DepositoDao {

    @Autowired
    private DepositoJpaRepository repository;

    public Deposito save(Deposito dep) {
        return repository.save(dep);
    }

    public Optional<Deposito> findById(Integer id) {
        return repository.findById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public Iterable<Deposito> findAll() {
        return repository.findAll();
    }
}
