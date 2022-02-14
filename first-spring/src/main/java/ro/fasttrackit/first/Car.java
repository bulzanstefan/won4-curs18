package ro.fasttrackit.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        System.out.println("We built a car");
        System.out.println(engine);
        this.engine = engine;
    }

//    @Autowired
//    public void setEngine(Engine engine) {
//        System.out.println("setting engine");
//        this.engine = engine;
//    }

    @Override
    public String toString() {
        return "This is my car " + engine;
    }
}
