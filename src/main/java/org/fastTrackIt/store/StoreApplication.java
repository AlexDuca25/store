package org.fastTrackIt.store;

import org.fastTrackIt.store.model.StoreUser;
import org.fastTrackIt.store.repository.StoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}
	@Bean
	CommandLineRunner atStartUp(StoreRepository repository){
		return args -> {
			StoreUser e1 =new StoreUser("Alex","alex25duca@gmail.com",31,"123");
			StoreUser e2 =new StoreUser("Alex","alex25duca@gmail.com",31,"123");
			repository.save(e1);
			repository.save(e2);
		};
	}

}
