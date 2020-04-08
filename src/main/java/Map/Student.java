package Map;

import java.util.Date;
public class Student {
    String surname;
    String name;
    String secondName;
    Long birthday; // Long instead of long is used by Gson/Jackson json parsers and various orm databases

    public Student(String surname, String name, String secondName, Date birthday ){
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.birthday = birthday == null ? 0 : birthday.getTime();
    }

    @Override
    public int hashCode(){
        //TODO: check for nulls
        return (surname + name + secondName + birthday).hashCode();
    }
    @Override
    public boolean equals(Object other_) {
        Student other = (Student) other_;
        return (surname == null || surname.equals(other.surname) )
                && (name == null || name.equals(other.name))
                && (secondName == null || secondName.equals(other.secondName))
                && (birthday == null || birthday.equals(other.birthday));
    }
}
