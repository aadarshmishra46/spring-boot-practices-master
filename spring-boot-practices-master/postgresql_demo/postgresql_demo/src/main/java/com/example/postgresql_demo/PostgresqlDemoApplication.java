package com.example.postgresql_demo;

import com.example.postgresql_demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostgresqlDemoApplication implements CommandLineRunner {

	@Autowired
	private StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	this.studentDao.createTable();
		// this.studentDao.insertData("Mukesh","Noida");
	//	this.studentDao.updateData(2);
		//this.studentDao.delete(1);
	}
}
