/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Date;
import java.util.List;

/**
 *
 * @author niza
 */
public class Student extends Person {
    
    private String carnet;
    private String grade;
    private List <Courses> course;

    public Student() {
    }

    public Student(String carnet, String grade, List<Courses> course, String name, String lastName, int age, String gender, Date dateOfBirth) {
        super(name, lastName, age, gender, dateOfBirth);
        this.carnet = carnet;
        this.grade = grade;
        this.course = course;
    }
     
    public String getCarnet() {
        return carnet;
    }

    public String getGrade() {
        return grade;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Courses> getCourse() {
        return course;
    }

    public void setCourse(List<Courses> course) {
        this.course = course;
    }
}
