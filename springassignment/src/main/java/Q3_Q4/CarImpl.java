package Q3_Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarImpl {
    @Autowired
    Car car;
    public void showCarType(){
        this.car.showCarType();
    }
}
