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
public class Courses {
    
    private String name;
    private List<Score> score; 

    public Courses(String name, List<Score> score) {
        this.name = name;
        this.score = score;
    }

    public Courses() {
    }

    public String getName() {
        return name;
    }

    public List<Score> getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(List<Score> score) {
        this.score = score;
    }
    
    
}


