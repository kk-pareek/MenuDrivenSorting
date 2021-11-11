package operations;

import entity.Cricketer;

import java.util.Comparator;

public class SortCricketers {
    public class SortByFirstName implements Comparator<Cricketer> {
        @Override
        public int compare(Cricketer o1, Cricketer o2) {
            String o1FirstName = getFirstName(o1.getName());
            String o2FirstName = getFirstName(o2.getName());
            return o1FirstName.compareTo(o2FirstName);
        }

        private String getFirstName(String name) {
            if(name.split("\\w+").length>1)
                return name.substring(0, name.lastIndexOf(' '));
            else
                return name;
        }
    }

    public class SortByLastName implements Comparator<Cricketer> {

        @Override
        public int compare(Cricketer o1, Cricketer o2) {
            String o1LastName = getLastName(o1.getName());
            String o2LastName = getLastName(o2.getName());
            return o1LastName.compareTo(o2LastName);
        }

        private String getLastName(String name) {
            if(name.split("\\w+").length>1){
                return name.substring(name.lastIndexOf(" ")+1);
            }
            else{
                return name;
            }
        }
    }

    public class SortByCountry implements Comparator<Cricketer> {
        @Override
        public int compare(Cricketer o1, Cricketer o2) {
            return o1.getCountry().compareTo(o2.getCountry());
        }
    }

    public class SortByAge implements Comparator<Cricketer> {
        @Override
        public int compare(Cricketer o1, Cricketer o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }
}
