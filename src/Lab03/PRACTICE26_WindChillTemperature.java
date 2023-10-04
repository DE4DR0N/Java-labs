/*
Задание
Напишите код для расчет эффективной температуры воздуха в зависимости от
температуры, скорости ветра и влажности. Для расчета используйте данные по
ссылке или из других интернет источников.
https://ggf.tsu.ru/content/faculty/structure/chair/meteorology/publications/%D0%
9A%D0%BB%D0%B8%D0%BC%D0%B0%D1%82%D0%BE%D0%BB%D0%BE%D0%B3%D0%B8%D1%8F/text/149.ht
ml
*/
package Lab03;

import java.util.Scanner;
/**
 * реализация функции расчёта эффективной температуры
 *
 * @author E.A. Gedrevich
 * @version 1.0 04.10.2023
 */
public class PRACTICE26_WindChillTemperature {
    public static void Main(String[] args){
        Scanner input = new Scanner(System.in);

        double tmpr = input.nextDouble();
        double hmdt = input.nextDouble();
        double spd = input.nextDouble();

        System.out.println("The result is " + calculate(tmpr, hmdt, spd));
    }
    public static double calculate(double temperature, double relativeHumidity, double windSpeed){
        return 37 - ((37-temperature)/(0.68-0.0014*relativeHumidity+(1/(1.76+1.4*Math.pow(windSpeed,0.75)))))-0.29*temperature*(1-(relativeHumidity/100));;
    }
}
