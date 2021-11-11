package entity;

import java.util.Objects;

public class Cricketer {
    private String name;
    private String country;
    private int age;

    public Cricketer(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cricketer)) return false;
        Cricketer cricketer = (Cricketer) o;
        return age == cricketer.age &&
                name.equals(cricketer.name) &&
                country.equals(cricketer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, age);
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}
