package Q2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Q2ApplicationMain {

	public static void main(String[] args) {

		//SpringApplication.run(Q1ApplicationMain.class, args);
		Car car = new Swift();
		CarImpl comfortableCar = new CarImpl(car);
		comfortableCar.showCarType();
	}

}
