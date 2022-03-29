package com.example.lab08;

public class StudentRecord {
    private String id;
    private float assignment;
    private float midMarks;
    private float finalMarks;
    private float exam;
    private String grade;

    public StudentRecord(String id, float assignment, float midMarks, float exam) {
        this.id = id;
        this.assignment = assignment;
        this.midMarks = midMarks;
        this.exam = exam;
        this.finalMarks = (midMarks*0.3f + assignment*0.2f + exam*0.5f);

        if(finalMarks >= 80 && finalMarks <= 100.0){
            this.grade = "A";
        }
        else if (finalMarks > 70 && finalMarks <= 80){
            this.grade = "B";
        }
        else if (finalMarks > 60 && finalMarks <= 70){
            this.grade = "C";
        }
        else if (finalMarks > 50 && finalMarks <= 60){
            this.grade = "D";
        }
        else{
            this.grade = "F";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {this.id = id;}

    public float getAssignment() {
        return assignment;
    }

    public void setAssignment(float assignment) {this.assignment = assignment;}
    public float getMidMarks() {
        return midMarks;
    }

    public void setMidMarks(float midMarks) {this.midMarks = midMarks;}

    public float getFinalMarks() {
        return finalMarks;
    }

    public String getGrade() {
        return grade;
    }

    public float getExam() {
        return exam;
    }
    public void setExam(float exam) {this.exam = exam;}
}


