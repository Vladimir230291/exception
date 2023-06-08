package Sem2_DZ;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class task1 {


    public static void main(String[] args) {
        float a = inputFloat();
        System.out.println(a);
    }

    private static float inputFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        try {
            String num = sc.next().replace(",", ".");
            return Float.parseFloat(num);
        } catch (Exception e) {
            System.out.println("Не корректный ввод! Попробуйте еще раз");
            return inputFloat();
        }
    }
}