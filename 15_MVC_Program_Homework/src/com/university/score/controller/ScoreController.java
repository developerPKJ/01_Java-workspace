package com.university.score.controller;

import java.util.ArrayList;

import com.university.score.model.vo.Student;

public class ScoreController {

    public void create(ArrayList<Student> list, String studentNo, String name, int kor, int eng, int math) {
        list.add(new Student(studentNo, name, kor, eng, math));
    }

    public ArrayList<Student> read(ArrayList<Student> list) {
        return list;
    }

    public ArrayList<Student> read(ArrayList<Student> list, String keyword) {
        ArrayList<Student> result = new ArrayList<>();

        for (Student student : list) {
            if (student.getStudentNo().contains(keyword) || student.getName().contains(keyword)) {
                result.add(student);
            }
        }

        return result;
    }

    public boolean update(ArrayList<Student> list, int index, String studentNo, String name, int kor, int eng, int math) {
        if (index < 0 || index >= list.size()) {
            return false;
        }

        list.set(index, new Student(studentNo, name, kor, eng, math));
        return true;
    }

    public Student delete(ArrayList<Student> list, int index) {
        if (index < 0 || index >= list.size()) {
            return null;
        }

        return list.remove(index);
    }
}