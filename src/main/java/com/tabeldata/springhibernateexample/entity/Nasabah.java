package com.tabeldata.springhibernateexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "master_nasabah")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nasabah {

    @Id
    @Column(name = "nomor_nasabah", nullable = false, length = 50)
    private String cif;

    @Column(name = "nama_lengkap", nullable = false, length = 100)
    private String namaLengkap;

    @Lob
    @Column(name = "alamat_domisili")
    private String alamat;

    @Column(name = "tanggal_lahir", nullable = false)
    private Date tanggalLahir;

    @Column(name = "is_active", nullable = false)
    private boolean active;

    @Column(name = "saldo_keseluruhan")
    private BigDecimal saldo;

    @Column(name = "bunga_per_anum")
    private Double bungaPerAnum;

    @Column(name = "jumlah_transaksi")
    private Integer jumlahTransaksi;

    @Column(name = "tanggal_permohonan")
    private Timestamp tanggalPermohonan;


}
