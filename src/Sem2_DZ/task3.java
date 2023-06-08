package Sem2_DZ;

import java.io.FileNotFoundException;

public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9; // Указывается индекс за пределами массива, ошибка обрабатывается.
//            Была нарушена иерархия исключении, "Thowable" был указан первым, последующие catch не были бы выброшены.
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // Указывается исключение которое ни когда в это методе не будет выброшено, так как нет работы с фалами.
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
