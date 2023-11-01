package Lab06;

import java.util.ArrayList;

/**
 * Define the main class
 *
 * @author Gedrevich E.A.
 * @version 1.0 26.10.2023
 */
public class PRACTICE62_TestTeacher {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Eugene", "Minsk");
        System.out.println(person1);
        System.out.println(person2);

        Teacher eugene = new Teacher("Eugene", "Minsk",0,3,new ArrayList<>());

        eugene.setCodesOfClasses(2221);
        eugene.setCodesOfClasses(2221);
        eugene.setCodesOfClasses(2121);
        System.out.println(eugene);
        eugene.deleteCodesOfClasses(2221);
        System.out.println(eugene);

    }
}

