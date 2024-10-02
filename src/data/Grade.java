/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.List;

/**
 *
 * @author niza
 */
public class Grade {
    
    private int idGrade;
    private Professor professor;
    private List<Student> students;

    public Grade(int idGrade, Professor professor, List<Student> students) {
        this.idGrade = idGrade;
        this.professor = professor;
        this.students = students;
    }

    public Grade() {
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Grade(int idGrade) {
        this.idGrade = idGrade;
    }

    public int getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(int idGrade) {
        this.idGrade = idGrade;
    }
}
