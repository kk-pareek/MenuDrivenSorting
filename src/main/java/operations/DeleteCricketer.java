package operations;

import entity.Cricketer;

import java.util.List;

public class DeleteCricketer {
    public static void deleteByName(String name, List<Cricketer> listOfCricketers) {
        for(Cricketer ref: listOfCricketers) {
            if (ref.getName().compareTo(name) == 0) {
                listOfCricketers.remove(ref);
                break;
            }
        }
        System.out.println("List of Cricketers post deletion:");
        listOfCricketers.forEach(System.out::println);
    }

    public static void deleteByCountry(String country, List<Cricketer> listOfCricketers) {
        for(Cricketer ref: listOfCricketers) {
            if(ref.getCountry().compareTo(country) == 0) {
                listOfCricketers.remove(ref);
                break;
            }
        }
        System.out.println("List of Cricketers post deletion:");
        listOfCricketers.forEach(System.out::println);
    }

    public static void deleteByAge(Integer age, List<Cricketer> listOfCricketers) {
        for(Cricketer ref: listOfCricketers) {
            if(ref.getAge().compareTo(age) == 0) {
                listOfCricketers.remove(ref);
                break;
            }
        }
        System.out.println("List of Cricketers post deletion:");
        listOfCricketers.forEach(System.out::println);
    }
}
