package com.pritish.session1;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pritish.session1.dao.ImageDao;
import com.pritish.session1.model.Image;

@SpringBootApplication
public class App implements CommandLineRunner{
	private ImageDao dao;
	
	public App(ImageDao dao) {
		this.dao = dao;
	}
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dao.save(new Image(UUID.randomUUID(), "url1"));
		dao.save(new Image(UUID.randomUUID(), "url2"));
		
	}

}
