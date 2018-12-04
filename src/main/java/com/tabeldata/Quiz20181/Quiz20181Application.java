package com.tabeldata.Quiz20181;

import com.tabeldata.Quiz20181.model.Nasabah;
import com.tabeldata.Quiz20181.model.Tabunganku;
import com.tabeldata.Quiz20181.model.TransaksiTabungan;
import com.tabeldata.Quiz20181.repository.NasabahDao;
import com.tabeldata.Quiz20181.repository.TabungankuDao;
import com.tabeldata.Quiz20181.repository.TransaksiDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class Quiz20181Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Quiz20181Application.class, args);

		NasabahDao nasabahDao = applicationContext.getBean(NasabahDao.class,args);
		TabungankuDao tabungankuDao = applicationContext.getBean(TabungankuDao.class,args);
		TransaksiDao transaksiDao = applicationContext.getBean(TransaksiDao.class,args);

		Nasabah n1 = nasabahDao.save(new Nasabah(
				"Nasabah 01",
				"Sulaeman Hasim",
				"Jl. Bojongsoang no. 110",
				"Bandung",
				"Ciparay",
				"081123123543"
		));

		List<TransaksiTabungan> listTransaksi = new ArrayList<TransaksiTabungan>();

		TransaksiTabungan transaksi1 = transaksiDao.save(new TransaksiTabungan(
				null,
				001,
				Date.valueOf("2017-08-01"),
				BigDecimal.valueOf(250000),
				BigDecimal.ZERO,
				BigDecimal.valueOf(250000)


		));
		TransaksiTabungan transaksi2 = transaksiDao.save(new TransaksiTabungan(
				null,
				001,
				Date.valueOf("2017-08-20"),
				BigDecimal.valueOf(250000),
				BigDecimal.ZERO,
				BigDecimal.valueOf(500000)


		));
		TransaksiTabungan transaksi3 = transaksiDao.save(new TransaksiTabungan(
				null,
				001,
				Date.valueOf("2017-08-01"),
				BigDecimal.valueOf(50000),
				BigDecimal.ZERO,
				BigDecimal.valueOf(550000)


		));
		TransaksiTabungan transaksi4 = transaksiDao.save(new TransaksiTabungan(
				null,
				001,
				Date.valueOf("2017-08-01"),
				BigDecimal.ZERO,
				BigDecimal.valueOf(250000),
				BigDecimal.valueOf(300000)


		));
		listTransaksi.add(transaksi1);
		listTransaksi.add(transaksi2);
		listTransaksi.add(transaksi3);
		listTransaksi.add(transaksi4);

		Tabunganku tabungan01 = tabungankuDao.save(new Tabunganku(
				null,
				n1,
				Date.valueOf("20" +
						"17-08-01"),
				BigDecimal.valueOf(300000),
				listTransaksi

		));

		Tabunganku simpan = tabungankuDao.save(tabungan01);
		Optional<Tabunganku> tampilTabungan = tabungankuDao.findById(simpan.getId());
		log.info("{}", tampilTabungan.get());



	}
}
