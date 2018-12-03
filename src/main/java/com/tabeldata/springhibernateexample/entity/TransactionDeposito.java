package com.tabeldata.springhibernateexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaksi_deposito")
public class TransactionDeposito {

    @Id
    @GenericGenerator(name = "gen_uuid", strategy = "uuid2")
    @GeneratedValue(generator = "gen_uuid")
    private String id;

    @Column(name = "tanggal_transaksi", nullable = false)
    private Timestamp tanggalTransaksi;

    @Column(name = "debit", nullable = false)
    private BigDecimal debit;

    @Column(name = "kredit", nullable = false)
    private BigDecimal kredit;

    @Column(name = "saldo", nullable = false)
    private BigDecimal saldo;

}
