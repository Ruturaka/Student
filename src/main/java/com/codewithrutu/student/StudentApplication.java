package com.codewithrutu.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(StudentApplication.class);
	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		System.out.println("We are inside student application's main()");
	}

	@Override
	public void run(String... args) {

		log.info("StartApplication...");

		repository.save(new Student("Rutu"));
		repository.save(new Student("Kartik"));
		repository.save(new Student("Harsh"));

		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));

		System.out.println("\nfindById(1L)");
		repository.findById(1l).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByName('Node')");
		repository.findByName("Node").forEach(x -> System.out.println(x));

	}





}
