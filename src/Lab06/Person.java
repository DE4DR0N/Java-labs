package Lab06;

/**
 * Define class Person
 *
 * @author Gedrevich E.A.
 * @version 1.0 26.10.2023
 */
public class Person {
    String name;
    String adress;

    public Person() {
        name = "Unknown";
        adress = "default";
    }

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
