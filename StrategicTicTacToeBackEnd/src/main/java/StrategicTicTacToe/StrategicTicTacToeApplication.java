package StrategicTicTacToe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongoRepositories
public class StrategicTicTacToeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategicTicTacToeApplication.class, args);
	}

}
