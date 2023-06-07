package Sem1_DZ;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        int[] array1 = {10, 12, 23, 34, 45};
        int[] array2 = {6, 7, 4, 6, 8};
        System.out.println(differenceArrays(array1, array2));
    }

    public static List<Integer> differenceArrays(int[] array1, int[] array2) {
        List<Integer> resultArray = new ArrayList<>();
        if (checkLengthArrays(array1, array2)) {
            for (int i = 0; i < array1.length; i++) {
                resultArray.add(array1[i] - array2[i]);
            }
        }
        return resultArray;
    }

    private static boolean checkLengthArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        return true;
    }
}