/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import data.Conexion;
import data.Courses;
import data.Grade;
import data.Professor;
import data.Score;
import data.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class SQLMethods {

    Conexion conexion = null;
    
    public SQLMethods(Conexion con) {
        
        conexion = con;
    }
    
    public int[] SelectGrades(){
        int[] grades = new int[6];
        
        String query = "SELECT id_grade FROM grade";
        
        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();  
            int i = 0;
            while (rs.next()) {
                int grade = rs.getInt("id_grade");
                grades[i] = grade;
                i++;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return grades;
    }
    
    public List<course> SelectCourses(){
        List<course> courses = new ArrayList();
        course newCourse = null;
        
        String query = "SELECT id_course, course_name FROM course";
        
        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();  
            while (rs.next()) {
                newCourse = new course();
                newCourse.setId_course(rs.getInt("id_course"));
                newCourse.setCourse_name(rs.getNString("course_name"));

                courses.add(newCourse);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return courses;
    }
    
    public Professor SelectProfessor(int id_grade){
        Professor professor = new Professor();
        
        String query = "SELECT grade, carnet, name, last_name, age, gender, date_Of_Birth, id_grade FROM professor where id_grade = ?";
        
        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id_grade);
            ResultSet rs = stmt.executeQuery();  
            if (rs.next()) {
                
                professor.setCarnet(rs.getNString("carnet"));
                professor.setName(rs.getNString("name"));
                professor.setLastName(rs.getNString("last_name"));
                professor.setGender(rs.getNString("gender"));
                professor.setDateOfBirth(rs.getDate("date_Of_Birth"));
                professor.setIdProfessor(rs.getInt("id_grade"));
                professor.setAge(rs.getInt("age"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return professor;
    }
    
    public List<Student> SelectStudents(int id_grade){
        List<Student> students = new ArrayList();
        Student newStudent = null;
        List<course> courss = SelectCourses();
        
        String query = "SELECT id_Student, grade, carnet, name, last_name, age, gender, date_Of_Birth, id_grade FROM student where id_grade = ?";
        
        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id_grade);
            ResultSet rs = stmt.executeQuery();  
            while (rs.next()) {
                newStudent = new Student();
                newStudent.setCarnet(rs.getNString("carnet"));
                newStudent.setName(rs.getNString("name"));
                newStudent.setLastName(rs.getNString("last_name"));
                newStudent.setGender(rs.getNString("gender"));
                newStudent.setDateOfBirth(rs.getDate("date_Of_Birth"));
                newStudent.setIdStudent(rs.getInt("id_Student"));
                newStudent.setAge(rs.getInt("age"));
                newStudent.setCourse(SelectScores(newStudent.getIdStudent(), courss));
                
                students.add(newStudent);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return students;
    }
    
    public int CrearStudent(String name, String lastName, int Age, String gender, String grade, int IGrad, String dateb){
        
        String carnet = "";
        String query2 = "SELECT carnet FROM student ORDER BY id_student DESC LIMIT 1";      
        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt2 = conn.prepareStatement(query2)) {

            ResultSet rs = stmt2.executeQuery();  
            if (rs.next()) {
                carnet = rs.getString("carnet");
            }      
        } catch (SQLException e) {
            e.printStackTrace();
        }      
        carnet = carnet.substring(1,carnet.length());
        int Icarnet = Integer.parseInt(carnet);
        Icarnet++;
        carnet = "S" + String.valueOf(Icarnet);
        
        int result = 0;
        String query = "INSERT INTO student (carnet, grade, name, last_name, age, gender, date_Of_Birth, id_grade) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, carnet);
            stmt.setString(2, grade);
            stmt.setString(3, name);
            stmt.setString(4, lastName);
            stmt.setInt(5, Age);
            stmt.setString(6, gender);
            stmt.setString(7, dateb);
            stmt.setInt(8, IGrad);
            
            result = stmt.executeUpdate();  
                
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
        return result;
    }
    
    public List<Courses> SelectScores(int id_student, List<course> course){
        List<Courses> courses = new ArrayList();
        List<course> LCourse = course;

        String query = "SELECT id_score, score_1, score_2, score_3, score_4, average, id_course " +
                       "FROM dbschool.score WHERE id_student = ?";

        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id_student);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Courses newCourse = new Courses();
                Score score = new Score();

                score.setScore1(rs.getInt("id_score"));
                score.setScore1(rs.getFloat("score_1"));
                score.setScore2(rs.getFloat("score_2"));
                score.setScore3(rs.getFloat("score_3"));
                score.setScore4(rs.getFloat("score_4"));
                score.setAverageScore(rs.getFloat("average"));

                int id_course = rs.getInt("id_course");

                for (course cour : LCourse) {
                    if (cour.getId_course() == id_course) {
                        newCourse.setName(cour.getCourse_name());
                        break;
                    }
                }
                newCourse.setScore(score);
                courses.add(newCourse);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return courses;
    }
    
    public int UpdateNotas(Score score){
        
        String query = "UPDATE score\n" +
                "SET score_1=?, score_2=?, score_3=?, score_4=?, average=?\n" +
                "WHERE id_score=?;";
        int result = 0;
        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setFloat(1, score.getScore1());
            stmt.setFloat(2, score.getScore2());
            stmt.setFloat(3, score.getScore3());
            stmt.setFloat(4, score.getScore4());
            stmt.setFloat(5, score.getAverageScore());
            stmt.setFloat(6, score.getId_score());
            
            result = stmt.executeUpdate();  
                
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
        return result;
    }
}
