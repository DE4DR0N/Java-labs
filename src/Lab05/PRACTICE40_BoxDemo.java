/*
Задание
Изучите и законспектируйте теорию:
1. Классы и объекты (экземпляры классов)
Повторите выполнение данного примера.
Разберитесь в решаемой задаче.
Самостоятельно:
Дополнить класс Box еще одним полем - цвет границы.
Задать цвет для экземпляра myBox.
Создать другой (с именем myBox2) экземпляр класса Box.
Инициализировать его поля.
Вычислить площадь.
Вывести на печать значения всех полей и площади экземпляра myBox2.
Написать javadoc комментарий к классу и методам.
Контрольные вопросы (ответы также включить в отчет)
1. Как создаются экземпляры класса?
2. Как изменить поля экземпляра класса?
*/
package Lab05;
/**
 * Создание объектов
 * на простом примере Box (прямоугольник)
 * Класс очень простой и не содержит методов.
 *
 * @author Gedrevich E.A.
 * @version 1.0 17.10.2023
 */
class Box{
    // поля класса
    double width;
    double height;
    String sideColor;
}
/**
 * Класс для тестрования класса Box
 *
 * @author Gedrevich E.A.
 * @version 1.0 17.10.2023
 */
public class PRACTICE40_BoxDemo {
    public static void main(String[] args) {
// Создаем экземпляр (с именем) myBox класса Box
        Box myBox = new Box();
        double area;
// присваиваем значение переменным экземпляра
        myBox.height = 25;
        myBox.width = 30;
        myBox.sideColor = "Red";
// вычисляем площадь прямоугольника
        area = myBox.height * myBox.width;
        System.out.println("Площадь прямоугольника = " + area);
// Создаем экземпляр (с именем) myBox2 класса Box
        Box myBox2 = new Box();
// присваиваем значение переменным экземпляра
        myBox2.height = 30;
        myBox2.width = 35;
        myBox2.sideColor = "Green";
// вычисляем площадь прямоугольника
        area = myBox2.height * myBox2.width;
        System.out.println("Поля экземпляра myBox2 класса Box:" +
                "\nвысота: " + myBox2.height +
                "\nширина: " + myBox2.width +
                "\nцвет стороны: " + myBox2.sideColor);
        System.out.println("Площадь прямоугольника = " + area);
    }
}