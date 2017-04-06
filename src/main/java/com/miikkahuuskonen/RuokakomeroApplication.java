package com.miikkahuuskonen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ruokakomero.model.Ruoka;
import com.ruokakomero.model.RuokaRepository;
import com.ruokakomero.model.User;
import com.ruokakomero.model.UserRepository;

@SpringBootApplication
public class RuokakomeroApplication {
	private static final Logger log = LoggerFactory.getLogger(RuokakomeroApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RuokakomeroApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(RuokaRepository repository, UserRepository urepository) {
		
		return (args) -> {
			
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$05$bvIG6Nmid91Mu9RcmmWZfO5HJIMCT8riNW0hEp8f6/FuA2/mHZFpe", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			 
			 log.info("fetch all books");
				for (Ruoka ruoka : repository.findAll()) {
					log.info(ruoka.toString());
				}
		};
	}
}
