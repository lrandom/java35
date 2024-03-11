package models;

public class Student extends Human{
    public String getStudentInfo() {
        return "Name:"+this.name+",Age:"+this.age;
    }
}
