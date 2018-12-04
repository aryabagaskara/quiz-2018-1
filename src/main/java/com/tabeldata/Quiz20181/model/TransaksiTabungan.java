package com.tabeldata.Quiz20181.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "transaksi_tabungan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransaksiTabungan {

    @Id
    @GenericGenerator(name = "gen-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "gen-uuid")
    private String id;

    //01 untuk debet, 02 untuk debit
    @Column(name = "kode_transaksi", nullable = false)
    private Integer kode;

    @Column(name = "tanggal_transaksi", nullable = false)
    private Date tanggalTransaksi;

    @Column(name = "debit", nullable = false)
    private BigDecimal debit;

    @Column(name = "kredit", nullable = false)
    private BigDecimal kredit;

    @Column(name = "saldo", nullable = false)
    private BigDecimal saldo;


}
