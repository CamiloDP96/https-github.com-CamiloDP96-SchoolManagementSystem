package main.java.com.school_management_system.user;

import java.util.Date;

public class Student {
    int id;
    String name;
    String lastName;
    Date birthDay;
    String status;

    Student(int id,String name, String lastName, Date birthDay, String status){
        this.id = id;
        this.name = name;
        this.lastName =lastName;
        this.birthDay = birthDay;
        this.status = status;
    }

    //Getters n setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", lastName='" + lastName + '\'' +
        ", birthDay=" + birthDay +
        ", status='" + status + '\'' +
        '}';
    }

}
