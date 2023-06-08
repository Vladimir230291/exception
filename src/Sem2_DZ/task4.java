package Sem2_DZ;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class task4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите не пустую строку: ");
        String test = inputString();

    }
    private static String inputString() throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя");
        }
        return str;

    }
}
