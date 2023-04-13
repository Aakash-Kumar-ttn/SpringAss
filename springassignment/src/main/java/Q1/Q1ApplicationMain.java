package Q1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Q1ApplicationMain {

	public static void main(String[] args) {

		//SpringApplication.run(Q1ApplicationMain.class, args);
		CarImpl comfortableCar = new CarImpl();
		comfortableCar.showCarType();
	}

}
