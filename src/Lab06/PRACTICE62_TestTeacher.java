package Lab06;
class Person {
    String name;
    String adress;
}
class Teacher extends Person {
    int countOfClasses;
    int maxCountOfClasses;
    int[] codesOfClasses = new int[maxCountOfClasses];


    public void addClass(int code) {
        for (var codeOfClass:
             codesOfClasses) {
            if (code == codeOfClass) return;
        }

    }
}
public class PRACTICE62_TestTeacher {

}
