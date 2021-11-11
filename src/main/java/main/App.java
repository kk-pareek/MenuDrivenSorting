package main;

import entity.Cricketer;
import ui.Ui;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        List<Cricketer> listOfCricketers = new ArrayList<>();
        listOfCricketers.add(new Cricketer("Rohit Sharma", "India", 34));
        listOfCricketers.add(new Cricketer("Virat Kohli", "India", 34));
        listOfCricketers.add(new Cricketer("Shane Watson", "India", 38));
        listOfCricketers.add(new Cricketer("Surya Kumar Yadav", "India", 34));
        listOfCricketers.add(new Cricketer("AB De Viliers", "India", 38));

        Ui.handleUserInteraction(listOfCricketers);
    }
}
