package Sem1_DZ;

public class task2 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"}};

        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
//        Необходимо вставить проверки, перед началом операции.
        if (checkNull(arr) && checkNumber(arr) && checkColumns(arr)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }

    //   1. проверка на null
    private static boolean checkNull(String[][] arrStr) {
        for (String[] strings : arrStr) {
            for (String string : strings) {
                if (string == null) {
                    throw new NullPointerException("В массиве есть null");
                }
            }
        }
        return true;
    }

    //    2. проверка на возможность преобразования в число
    private static boolean checkNumber(String[][] arrStr) {
        for (String[] strings : arrStr) {
            for (String string : strings) {
                try {
                    int val = Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    throw new ClassCastException("Невозможно преобразовать в число");
                }
            }
        }
        return true;
    }

    //    3. проверка на количество столбцов матрицы
    private static boolean checkColumns(String[][] arrStr) {
        for (String[] strings : arrStr) {
            if (strings.length != 5) {
                throw new RuntimeException("не подходящее число столбцов");
            }
        }
        return true;
    }
}
