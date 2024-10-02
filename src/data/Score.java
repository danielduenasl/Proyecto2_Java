/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author niza
 */
public class Score {
    
    private float score1;
    private float score2;
    private float score3;
    private float score4;
    private float averageScore;

    public Score() {
    }

    public Score(float score1, float score2, float score3, float score4, float averageScore) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.averageScore = averageScore;
    }

    public float getScore1() {
        return score1;
    }

    public float getScore2() {
        return score2;
    }

    public float getScore3() {
        return score3;
    }

    public float getScore4() {
        return score4;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setScore1(float score1) {
        this.score1 = score1;
    }

    public void setScore2(float score2) {
        this.score2 = score2;
    }

    public void setScore3(float score3) {
        this.score3 = score3;
    }

    public void setScore4(float score4) {
        this.score4 = score4;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
    
    public Float calculateAverage(){
        float result = score1 + score2 + score3 + score4;
        result = result / 4;
        return result;
    }
    
}
