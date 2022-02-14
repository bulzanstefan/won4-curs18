package ro.fasttrackit.curs18.firstweb;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    String sayHello() {
        System.out.println("CAlling sayHello()");
        return "Hello";
    }

    // /hello/persons
    @GetMapping("persons")
    List<Person> getPersons() {
        return List.of(
                new Person("Ana", 33),
                new Person("Dragos", 13),
                new Person("Maria", 26),
                new Person("Mihai", 52)
        );
    }

    @GetMapping("/persons/{personId}")
    Person getPerson(@PathVariable int personId,
                     @RequestParam(required = false) String name,
                     @RequestParam(required = false) int increase) {
        return new Person(name == null ? "Shoni" : name, personId + increase);
    }


}

record Person(String name, int age) {
}