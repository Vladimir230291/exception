package Sem3_DZ;


import java.util.Scanner;

import static Sem3_DZ.CheckData.*;
import static Sem3_DZ.UI.*;
import static Sem3_DZ.WriteAndReadFIle.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        start();
        String[] data = sc.nextLine().split(" ");
        Contact contact = new Contact(
                checkName(data[0]),
                checkName(data[1]),
                checkName(data[2]),
                checkBirthDate(data[3]),
                checkPhoneNumber(data[4]),
                checkGender(data[5]));
        writeToFile(contact);
    }


}
