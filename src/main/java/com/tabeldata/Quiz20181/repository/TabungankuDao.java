package com.tabeldata.Quiz20181.repository;

import com.tabeldata.Quiz20181.model.Tabunganku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TabungankuDao {

    @Autowired
    private TabungankuJpaInterface repository;

    public Tabunganku save(Tabunganku tabungan){
        return repository.save(tabungan);
    }
    public Optional<Tabunganku> findById(Integer id) {
        return repository.findById(id);
    }

}
