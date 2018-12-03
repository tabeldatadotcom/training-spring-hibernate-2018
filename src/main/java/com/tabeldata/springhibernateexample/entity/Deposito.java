package com.tabeldata.springhibernateexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "master_deposito")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deposito {

    @Id
    @SequenceGenerator(name = "dep_gen", allocationSize = 1, initialValue = 10, sequenceName = "deposito_seq")
    @GeneratedValue(generator = "dep_gen")
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_nasabah", nullable = false)
    private Nasabah nasabah;

    @Column(name = "jangka", nullable = false)
    private Integer jangka;

    @Column(name = "saldo", nullable = false)
    private BigDecimal saldo;

    @OneToMany
    @JoinTable(
            name = "history_transaksi_deposito",
            joinColumns = @JoinColumn(name = "deposito_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "transaksi_id", nullable = false)
    )
    private List<TransactionDeposito> listTransaksi = new ArrayList<>();
}
