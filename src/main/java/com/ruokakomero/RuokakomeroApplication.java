package com.ruokakomero;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ruokakomero.domain.Ruoka;
import com.ruokakomero.domain.RuokaRepository;
import com.ruokakomero.domain.User;
import com.ruokakomero.domain.UserRepository;


@SpringBootApplication
public class RuokakomeroApplication {
	private static final Logger log = LoggerFactory.getLogger(RuokakomeroApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RuokakomeroApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(RuokaRepository repository, UserRepository urepository) {
		
		return (args) -> {
			
			repository.save(new Ruoka("Olut", "23 tlk", "Karhu, 0,33", "08/02/2017"));
			repository.save(new Ruoka("Kahvi", "2 pkt", "Juhla Mokka, 500g", "08/03/2017"));
			repository.save(new Ruoka("Sokeri", "1 pkt", "Valkoinen taloussokeri", "08/04/2017"));
			
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$05$bvIG6Nmid91Mu9RcmmWZfO5HJIMCT8riNW0hEp8f6/FuA2/mHZFpe", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			 
			 log.info("fetch all ruoka");
				for (Ruoka ruoka : repository.findAll()) {
					log.info(ruoka.toString()); 
				} 
		};
	}
}
