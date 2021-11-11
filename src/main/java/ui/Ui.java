package ui;

import entity.Cricketer;
import operations.ReadCricketers;

import java.util.List;
import java.util.Scanner;

public class Ui {
    public static void handleUserInteraction(List<Cricketer> listOfCricketers) {
        do {
            Scanner sc = new Scanner(System.in);
            UiUtils.askUserForInput();
            int userChoice = sc.nextInt();
            sc.nextLine();

            switch (userChoice) {
                case 1:
                    UiUtils.addCricketer(listOfCricketers);
                    break;
                case 2:
                    ReadCricketers.showAllCricketers(listOfCricketers);
                    break;
                case 3:
                    UiUtils.deleteCricketer(listOfCricketers);
                    break;
                case 4:
                    UiUtils.searchCricketer(listOfCricketers);
                    break;
                case 5:
                    UiUtils.sortCricketers(listOfCricketers);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while(true);
    }
}
