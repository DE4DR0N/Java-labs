package Lab06;

import java.util.List;
import java.util.Objects;

/**
 * Define class Teacher based on Person
 *
 * @author Gedrevich E.A.
 * @version 1.0 26.10.2023
 */
public class Teacher extends Person {
    private int countOfClasses;
    private int maxCountOfClasses;
    private List<Integer> codesOfClasses;

    public Teacher( String name, String adress, int countOfClasses, int maxCountOfClasses, List<Integer> codesOfClasses) {
        super(name, adress);
        this.countOfClasses = countOfClasses;
        this.maxCountOfClasses = maxCountOfClasses;
        this.codesOfClasses = codesOfClasses;
    }

    public void setCodesOfClasses(Integer code) {
        if(countOfClasses < 1){
            countOfClasses++;
            codesOfClasses.add(code);
        } else{
            for (var n: codesOfClasses) {
                if ((!code.equals(n)) && (countOfClasses < maxCountOfClasses)){
                    countOfClasses++;
                    codesOfClasses.add(code);
                    break;
                }
            }

        }
    }

    public void deleteCodesOfClasses(Integer code) {
        if (!codesOfClasses.isEmpty()){
            for (var n: codesOfClasses) {
                if (code.equals(n)){
                    codesOfClasses.remove(code);
                    countOfClasses--;
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "countOfClasses=" + countOfClasses +
                ", maxCountOfClasses=" + maxCountOfClasses +
                ", codesOfClasses=" + codesOfClasses +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}