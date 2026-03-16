package com.university.score.model.vo;

public class Student {
    // FIELD
    private String studentNo;
    private String name;
    private int kor;
    private int eng;
    private int math;

    // CONSTRUCTOR
    public Student() {
    }

    public Student(String studentNo, String name, int kor, int eng, int math) {
        this.studentNo = studentNo;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // METHOD
    public String getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }
    
    public int getKor() {
        return kor;
    }
    
    public int getEng() {
        return eng;
    }
    
    public int getMath() {
        return math;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }
    
    public void setMath(int math) {
        this.math = math;
    }

    
    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();

        if (avg >= 90) {
            return "A";
        }
        if (avg >= 80) {
            return "B";
        }
        if (avg >= 70) {
            return "C";
        }
        if (avg >= 60) {
            return "D";
        }
        return "F";
    }

    @Override
    public String toString() {
        return "Student [학번=" + studentNo + ", 이름=" + name + ", 국어=" + kor + ", 영어=" + eng
                + ", 수학=" + math + ", 총점=" + getTotal() + ", 평균=" + String.format("%.2f", getAverage())
                + ", 학점=" + getGrade() + "]";
    }
}