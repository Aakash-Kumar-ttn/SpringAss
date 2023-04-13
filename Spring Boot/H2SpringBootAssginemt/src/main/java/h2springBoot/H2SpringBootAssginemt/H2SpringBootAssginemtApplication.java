package h2springBoot.H2SpringBootAssginemt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2SpringBootAssginemtApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2SpringBootAssginemtApplication.class, args);
	}

}


//Run the application and navigate to http://localhost:8080/h2-console
// to access the H2 console. Enter the database URL (jdbc:h2:mem:testdb),
// username (sa), and password (blank) to connect to the database.