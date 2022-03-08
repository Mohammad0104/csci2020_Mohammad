package com.example.lab05;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.security.PublicKey;

public class HelloController {
    private String Sid;
    private float Assignment;
    private float Midterm;
    private float FinalExam;
    private float FinalMark;
    private String LetterGrade;



    public HelloController(String Sid, float Assignment, float Midterm, float FinalExam) {
        this.Sid = Sid;
        this.Assignment=Assignment;
        this.Midterm = Midterm;
        this.FinalExam =FinalExam ;
        this. FinalMark= total_FinalMark(Assignment, Midterm, FinalExam);
        this.LetterGrade = gpa(FinalMark);
    }
    float total_FinalMark(float Assignment, float Midterm, float FinalExam) {
        float FinalMark = (Assignment*(20.00f/100.00f) + Midterm*(30.00f/100.00f) + FinalExam*(50.00f/100.00f));
        this.FinalMark = FinalMark;
        return FinalMark;
    }
    String gpa(float FinalMark) {
        String LetterGrade = "";
        if (FinalMark >= 80.00f) {
            LetterGrade = "A";
        } else if (FinalMark >=70.00f & FinalMark <= 79.00f) {
            LetterGrade = "B";
        } else if (FinalMark >=60.00f & FinalMark <= 69.00f) {
            LetterGrade = "C";
        } else if (FinalMark >=50.00f & FinalMark <= 59f) {
            LetterGrade = "D";
        } else   {
            LetterGrade = "F";
        }

        return LetterGrade;
    }
    public String getSid() {
        return Sid;
    }

    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    public float getAssignment() {
        return Assignment;
    }

    public void setAssignments(float Assignment) {
        this.Assignment = Assignment;
    }

    public float getMidterm() {
        return Midterm;
    }

    public void setMidterm(float midterm) {
        this.Midterm = midterm;
    }

    public float getFinalExam() {
        return FinalExam;
    }

    public void setFinalExam(float FinalExam) {
        this.FinalExam = FinalExam;
    }

    public float getFinalMark() {
        return FinalMark;
    }

    public void setFinalMark(float FinalMark) {
        this.FinalMark = FinalMark;
    }

    public String getLetterGrade() {
        return LetterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.LetterGrade = letterGrade;
    }
}

