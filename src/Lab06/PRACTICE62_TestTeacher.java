package Lab06;

import org.w3c.dom.ls.LSOutput;

/**
 * Define class Person
 *
 * @author Gedrevich E.A.
 * @version 1.0 26.10.2023
 */
class Person {
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
    public String toString() {
        return "Person: " + name +
                ' ' + adress +
                ' ' + "\n";
    }
}
/**
 * Define class Teacher based on Person
 *
 * @author Gedrevich E.A.
 * @version 1.0 26.10.2023
 */
class Teacher extends Person {
    int countOfClasses = 0;
    int maxCountOfClasses;
    int[] codesOfClasses = new int[maxCountOfClasses];

    public Teacher() {
        super();
        //countOfClasses = 0;
        maxCountOfClasses = 0;
    }
    public Teacher(String name, String adress, int count, int maxcount) {
        super(name, adress);
        //countOfClasses = count;
        maxCountOfClasses = maxcount;
    }
    public void addClass(int code) {
        if (countOfClasses == maxCountOfClasses) return;
        if (countOfClasses != 0) {
            for (var codeOfClass:
                    codesOfClasses) {
                if (codeOfClass == code) return;
            }
        }
        codesOfClasses[countOfClasses] = code; //error ArrayIndexOutOfBoundsException

        countOfClasses++;
    }
    @Override
    public String toString() {
        String codes = "";
        for (int elem:
                codesOfClasses) {
            codes += elem + "; ";
        }
        return "Teacher: " + name +
                ' ' + adress +
                ' ' + countOfClasses +
                ' ' + codes +
                ' ' + "\n";
    }
}
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
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Eugene", "Minsk", 3, 3);
        teacher2.addClass(72);
        teacher2.addClass(72);
        teacher2.addClass(73);
        teacher2.addClass(74);
        teacher2.addClass(75);
        System.out.println(teacher2.toString());
    }
}
