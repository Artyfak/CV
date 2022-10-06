package com.example.Pozicovnafullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"Pozicovnafullstack"})
@EnableJpaRepositories(basePackages="ZamestnanecRepository")
@EnableTransactionManagement

public class PozicovnafullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PozicovnafullstackApplication.class, args);
	}

}
