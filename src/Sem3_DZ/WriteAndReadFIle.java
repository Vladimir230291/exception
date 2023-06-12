package Sem3_DZ;


import java.io.FileWriter;

public class WriteAndReadFIle {
    //    Запись контакта в файл
    public static void writeToFile(Contact contact) throws Exception {
        String fileName = String.format("src/Sem3_DZ/ContactData/%s.txt", contact.getSurname());
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(contact.toString());
        } catch (Exception e) {
            System.err.format("не удалось записать фаил : %s", fileName);
        }
    }
//    показать содержимое фаила по запрошенной фамилии
//    сделать для себя!
    }

