package com.learning.jdbc;

import com.learning.jdbc.model.Programmer;
import com.learning.jdbc.repo.ProgrammerRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);
		Programmer coder=context.getBean(Programmer.class);
		coder.setId(12);
		coder.setName("Gagan");
		coder.setTech("Java");
		ProgrammerRepo data=context.getBean(ProgrammerRepo.class);
		data.save(coder);
		System.out.println(data.findAll());

	}

}
