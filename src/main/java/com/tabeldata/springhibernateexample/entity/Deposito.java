package com.tabeldata.springhibernateexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "master_deposito")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deposito {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_nasabah", nullable = false)
    private Nasabah nasabah;

    @Column(name = "jangka", nullable = false)
    private Integer jangka;

    @Column(name = "saldo", nullable = false)
    private BigDecimal saldo;

    @Column(name = "debit", nullable = false)
    private BigDecimal debit;

    @Column(name = "kredit", nullable = false)
    private BigDecimal kredit;
}
