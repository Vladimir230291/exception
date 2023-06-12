package Sem2_DZ;

public class task2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // 1.не был инициализирован массив
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d; // 2.в коде всегда будет выполняться деление на ноль
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}
