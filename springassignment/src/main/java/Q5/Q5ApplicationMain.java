package Q5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Q5ApplicationMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Q5ApplicationMain.class);
	   CarImpl comfortableCar = applicationContext.getBean(CarImpl.class);
		comfortableCar.showCarType();
	}

}
