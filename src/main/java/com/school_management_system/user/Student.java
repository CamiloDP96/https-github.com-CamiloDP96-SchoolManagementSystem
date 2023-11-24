package main.java.com.school_management_system.user;

import java.time.LocalDate;


public class Student extends Person{
    public Student(int id,String name, String lastName, LocalDate birthDay, String status){
    super(id,name,lastName,birthDay,status);
    }
}
