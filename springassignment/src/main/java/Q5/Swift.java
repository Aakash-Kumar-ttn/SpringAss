package Q5;

import Q3_Q4.Car;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Swift implements Car {
    @Override
    public void showCarType() {
        System.out.println("Swift IS A Cool CAR.");
    }
}
