/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Date;

/**
 *
 * @author niza
 */
public class Professor extends Person {
    
    private int idProfessor;

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    private String carnet;
    private String course;
    private int grade;

    public Professor() {
    }

    public Professor(String carnet, String course, int grade, String name, String lastName, int age, String gender, Date dateOfBirth) {
        super(name, lastName, age, gender, dateOfBirth);
        this.carnet = carnet;
        this.course = course;
        this.grade = grade;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    
}
