package br.com.meiraonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.meiraonline.service.DBService;

@SpringBootApplication
public class MeiraonlineDomainApplication implements CommandLineRunner{

	@Autowired
	private DBService dbService;
	
	public static void main(String[] args) {
		SpringApplication.run(MeiraonlineDomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		dbService.instantiateTestDataBase();		
	}

}
