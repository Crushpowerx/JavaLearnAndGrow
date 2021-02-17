package other;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ConstructorExampleStudent {
    String surname;
    String name;
    String secondName;
    String birthday; // Long instead of long is used by Gson/Jackson json parsers and various orm databases

    public ConstructorExampleStudent(String surname, String name, String secondName, String birthday ){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        if (birthday == null) {
            this.birthday = "was null : " + dtf.format(now);
        } else {
            this.birthday = birthday;
        }
    }

    public static void main(String[] args) {
        ConstructorExampleStudent constructorExampleStudent = new ConstructorExampleStudent("Surname",
                "Name", "Second Name", null);
        System.out.println(constructorExampleStudent.name);
        System.out.println(constructorExampleStudent.secondName);
        System.out.println(constructorExampleStudent.surname);
        System.out.println(constructorExampleStudent.birthday);
    }
}
