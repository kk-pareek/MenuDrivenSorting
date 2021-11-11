package ui;

import operations.AddCricketer;
import operations.DeleteCricketer;
import entity.Cricketer;
import operations.ReadCricketers;
import operations.SortCricketers;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UiUtils {
    public static void addCricketer(List<Cricketer> listOfCricketers) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter country: ");
        String country = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        AddCricketer.addCricketer(name, country, age, listOfCricketers);
    }

    public static void deleteCricketer(List<Cricketer> listOfCricketers) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select the basis you want to delete a cricketer on:\n" +
                "1. By name.\n" +
                "2. By country.\n" +
                "3. By age.");

        int userChoice = sc.nextInt();
        sc.nextLine();

        switch (userChoice) {
            case 1:
                System.out.println("Please Enter name:");
                String name = sc.nextLine();
                DeleteCricketer.deleteByName(name, listOfCricketers);
                break;

            case 2:
                System.out.println("Please Enter Country:");
                String country = sc.nextLine();
                DeleteCricketer.deleteByCountry(country, listOfCricketers);
                break;

            case 3:
                System.out.println("Please Enter Age:");
                Integer age = sc.nextInt();
                DeleteCricketer.deleteByAge(age, listOfCricketers);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void askUserForInput() {
        System.out.println("Hey there,\n" +
                "Please choose from the following:\n" +
                "1. Enter new cricketer details***\n" +
                "2. View all cricketers***\n" +
                "3. Delete a cricketer by name***\n" +
                "4. Search for a cricketer***\n" +
                "5. Sort by***\n" +
                "6. Exit***"
        );
    }

    public static void searchCricketer(List<Cricketer> listOfCricketers) {
        System.out.println("Please select the basis you want to search a cricketer on:\n" +
                "1. By name.\n" +
                "2. By country.\n" +
                "3. By age.");

        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        sc.nextLine();

        switch (userChoice) {
            case 1:
                System.out.println("Please Enter name:");
                String name = sc.nextLine();
                ReadCricketers.searchByName(name, listOfCricketers);
                break;

            case 2:
                System.out.println("Please Enter Country:");
                String country = sc.nextLine();
                ReadCricketers.searchByCountry(country, listOfCricketers);
                break;

            case 3:
                System.out.println("Please Enter Age:");
                Integer age = sc.nextInt();
                ReadCricketers.searchByAge(age, listOfCricketers);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void sortCricketers(List<Cricketer> listOfCricketers) {
        System.out.println("Please select the basis you want to sort the list on:\n" +
                "1. By first name.\n" +
                "2. By last name.\n" +
                "3. By country.\n" +
                "4. By age.");

        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                Collections.sort(listOfCricketers, new SortCricketers().new SortByFirstName());
                ReadCricketers.showAllCricketers(listOfCricketers);
                break;
            case 2:
                Collections.sort(listOfCricketers, new SortCricketers().new SortByLastName());
                ReadCricketers.showAllCricketers(listOfCricketers);
                break;
            case 3:
                Collections.sort(listOfCricketers, new SortCricketers().new SortByCountry());
                ReadCricketers.showAllCricketers(listOfCricketers);
                break;
            case 4:
                Collections.sort(listOfCricketers, new SortCricketers().new SortByAge());
                ReadCricketers.showAllCricketers(listOfCricketers);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
