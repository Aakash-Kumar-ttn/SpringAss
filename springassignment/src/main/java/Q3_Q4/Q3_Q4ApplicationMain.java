package Q3_Q4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Q3_Q4ApplicationMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Q3_Q4ApplicationMain.class);
		CarImpl comfortableCar = applicationContext.getBean(CarImpl.class);
		comfortableCar.showCarType();
	}

}
