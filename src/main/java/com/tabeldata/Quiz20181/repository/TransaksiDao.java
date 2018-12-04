package com.tabeldata.Quiz20181.repository;

import com.tabeldata.Quiz20181.model.TransaksiTabungan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransaksiDao {

    @Autowired
    private TransaksiJpaInterface repository;

    public TransaksiTabungan save(TransaksiTabungan transaksiTabungan){
        return repository.save(transaksiTabungan);
    }


    public Iterable<TransaksiTabungan> save(List<TransaksiTabungan> list){
        return repository.saveAll(list);
    }
}
