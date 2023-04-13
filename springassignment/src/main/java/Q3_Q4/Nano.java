package Q3_Q4;

import org.springframework.stereotype.Component;

@Component
public class Nano implements Car {
    @Override
    public void showCarType() {
        System.out.println("Nano IS A Cheap CAR.");
    }
}
