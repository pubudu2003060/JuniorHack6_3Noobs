package org.example.DTO;

public class StudentDTO {

    private int student_id;
    private String name;
    private int age;
    private String department;

    public StudentDTO() {
    }

    public StudentDTO(int student_id, String name, int age, String department) {
        this.student_id = student_id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
