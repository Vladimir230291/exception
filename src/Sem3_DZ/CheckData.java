package Sem3_DZ;

import java.util.Date;

public class CheckData {
    // проверка корректности ввода ФИО
    public static String checkName(String name) throws Exception {
        if (name.length() < 2) {
            return "тут должно быть отработать исключение";
        } else {
            return name.strip();
        }
    }

    // проверка корректности ввода даты
    public static String checkBirthDate(String birthDate) throws Exception {

        String regex = "\\d{2}\\.\\d{2}\\.\\d{4}";
        if (birthDate == null) {
            throw new Exception("Введите дату рождения");
        } else if (!birthDate.matches(regex)) {
            throw new Exception("Введите дату рождения в формате dd.mm.yyyy");
        } return checkDate(birthDate);



    }
    private static String checkDate(String birthDate) throws Exception {
        String[] date = birthDate.split("\\.");
        int[] dateInt = new int[3];
        for (int i = 0; i < date.length; i++) {
            dateInt[i] = Integer.parseInt(date[i]);
        }
        if (dateInt[0] > 31 || dateInt[0] < 1 || dateInt[1] > 12 ||dateInt[1] < 1 || dateInt[2] > 2023) {
            throw new Exception("Не корректная дата рождения проверьте вводные данные");
        }
        return birthDate;
    }
}


