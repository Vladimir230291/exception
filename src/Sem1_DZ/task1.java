package Sem1_DZ;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        outOfArray(arr);
        division(12, 0);
        String[] arrStr = new String[]{"1", "два", null, "4", "пять"};
        checkNull(arrStr);
    }

    //    деление на ноль
    public static void division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        } else {
            System.out.println(a / b);
        }
    }

    //    выход за пределы массива

    public static void outOfArray(int[] arr) {
        try {
            int impossible = arr[arr.length];
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
        }
    }

    //    Проверка на null

    public static void checkNull(String[] arrStr) {
        for (String s : arrStr) {
            if (s == null) {
                throw new NullPointerException("В массиве есть null");
            }
        }
    }
}