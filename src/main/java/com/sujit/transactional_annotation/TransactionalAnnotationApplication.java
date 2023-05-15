package com.sujit.transactional_annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionalAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionalAnnotationApplication.class, args);
	}

}
