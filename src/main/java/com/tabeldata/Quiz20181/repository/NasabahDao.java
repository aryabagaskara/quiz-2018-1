package com.tabeldata.Quiz20181.repository;

import com.tabeldata.Quiz20181.model.Nasabah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NasabahDao {

    @Autowired
    private NasabahJpaInterface repository;

    public Nasabah save(Nasabah nasabah) {
        return repository.save(nasabah);
    }
}
