package com.tabeldata.Quiz20181.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "master_tabunganku")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tabunganku {

    @Id
    @GeneratedValue
    @Column(name = "id_tabungan", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_nasabah", nullable = false)
    private Nasabah nasabah;

    @Column(name = "tanggal_buat_tabungan", nullable = false)
    private Date tanggalPembuatan;

    @Column(name = "saldo_tabungan", nullable = false)
    private BigDecimal saldoTabungan;

    @OneToMany
    @JoinTable(
            name = "histori_transaksi_tabunganku",
            joinColumns = @JoinColumn(name = "id_tabungan",nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_transaksi", nullable = false)
    )
    private List<TransaksiTabungan> listTransaksi=new ArrayList<TransaksiTabungan>();

}
