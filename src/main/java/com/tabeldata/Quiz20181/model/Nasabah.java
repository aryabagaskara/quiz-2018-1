package com.tabeldata.Quiz20181.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_nasabah")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nasabah {

    @Id
    @Column(name = "id_nasabah", nullable = false)
    private String id;

    @Column(name = "nama_nasabah", nullable = false)
    private String nama;

    @Column(name = "alamat_tinggal_nasabah")
    private String alamat;

    @Column(name = "kota_tinggal_nasabah")
    private String kota;

    @Column(name = "kecamatan_tinggal_nasabah")
    private String kecamatan;

    @Column(name = "nomor_handphone_nasabah")
    private String nomorHandphone;

}
