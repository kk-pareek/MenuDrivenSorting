package operations;

import entity.Cricketer;

import java.util.List;

public class ReadCricketers {
    public static void showAllCricketers(List<Cricketer> listOfCricketers) {
        listOfCricketers.forEach(System.out::println);
    }
    
    public static void searchByName(String name, List<Cricketer> listOfCricketers) {
        for(Cricketer ref: listOfCricketers) {
            if(ref.getName().contains(name)) {
                System.out.println(ref);
            }
        }
    }

    public static void searchByCountry(String country, List<Cricketer> listOfCricketers) {
        for(Cricketer ref: listOfCricketers) {
            if(ref.getName().contains(country)) {
                System.out.println(ref);
            }
        }
    }

    public static void searchByAge(Integer age, List<Cricketer> listOfCricketers) {
        for(Cricketer ref: listOfCricketers) {
            if(ref.getAge().compareTo(age) == 0) {
                System.out.println(ref);
            }
        }
    }
}
