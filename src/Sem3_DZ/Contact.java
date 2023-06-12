package Sem3_DZ;



public class Contact {
    String surname;
    String name;
    String secondName;
    String birthDate;
    String phoneNumber;
    String gender;

    public Contact(String surname, String name, String secondName, String birthDate,
                   String phoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + secondName + " " + birthDate + " " + phoneNumber + " " + gender + "\n";
    }
}
