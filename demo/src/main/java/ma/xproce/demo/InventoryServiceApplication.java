package ma.xproce.demo;

import ma.xproce.demo.repositories.creatorRepository;
import ma.xproce.demo.repositories.videoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication implements CommandLineRunner {
	@Autowired
	private creatorRepository creatorRepository;
	@Autowired
	private videoRepository videoRepository;
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
