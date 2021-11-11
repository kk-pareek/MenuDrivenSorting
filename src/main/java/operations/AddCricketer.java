package operations;

import entity.Cricketer;

import java.util.List;

public class AddCricketer {
    public static void addCricketer(String name, String country, Integer age, List<Cricketer> listOfCricketers) {
        listOfCricketers.add(new Cricketer(name, country, age));
        listOfCricketers.forEach(System.out::println);
    }
}
