package Sem3_DZ;


public class CheckData {
    // проверка корректности ввода ФИО
    public static String checkName(String name) throws Exception {
        if (name == null) {
            throw new Exception("Введите корректное ФИО");
        } else {
            return name;
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
//    проверка корректности ввода даты(числа)
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
//    проверка корректности ввода номера телефона
    public static String checkPhoneNumber(String phoneNumber) throws Exception {
        if (phoneNumber == null) {
            throw new Exception("Введите номер телефона");
        } else if (phoneNumber.length() != 11) {
            throw new Exception("Номер телефона должен содержать 11 цифр");
        }
        return phoneNumber;
    }
//    проверка корректности ввода пола
    public static String checkGender(String gender) throws Exception {
        if (gender == null) {
            throw new Exception("Введите пол");
        } else if (!gender.equals("f") && !gender.equals("m")) {
            throw new Exception("Пол должен содержать одну латинскую букву(f или m)");
        }
        return gender;
    }

}


