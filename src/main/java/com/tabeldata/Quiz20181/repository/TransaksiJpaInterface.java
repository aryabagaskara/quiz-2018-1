package com.tabeldata.Quiz20181.repository;

import com.tabeldata.Quiz20181.model.TransaksiTabungan;
import org.springframework.data.repository.CrudRepository;

public interface TransaksiJpaInterface extends CrudRepository<TransaksiTabungan,String> {
}
