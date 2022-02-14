package ro.fasttrackit.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(Car car, Person person, Engine engine) {
        return args -> {
            System.out.println(engine);
            System.out.println("Getting my car");
            System.out.println(car);
            System.out.println(person);
        };
    }

    @Bean
    Person myPerson() {
        return new Person("test");
    }
}

record Person(String name) {
}
