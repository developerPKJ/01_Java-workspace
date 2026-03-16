package com.university.score.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.university.score.controller.ScoreController;
import com.university.score.model.vo.Student;

public class ScoreView {
    private static final Scanner SC = new Scanner(System.in);

    public void mainMenu() {
        ScoreController controller = new ScoreController();
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n=== 학생 성적 관리 프로그램 ===");
            System.out.println("1. 학생 추가");
            System.out.println("2. 전체 조회");
            System.out.println("3. 학생 검색(학번/이름)");
            System.out.println("4. 학생 수정(index)");
            System.out.println("5. 학생 삭제(index)");
            System.out.println("0. 프로그램 종료");
            int choice = inputInt("메뉴 번호 선택 : ");

            switch (choice) {
                case 1:
                    createStudent(controller, list);
                    break;
                case 2:
                    readAll(controller, list);
                    break;
                case 3:
                    searchStudent(controller, list);
                    break;
                case 4:
                    updateStudent(controller, list);
                    break;
                case 5:
                    deleteStudent(controller, list);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    SC.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
                    break;
            }
        }
    }

    private void createStudent(ScoreController controller, ArrayList<Student> list) {
        System.out.println("\n[학생 추가]");
        String studentNo = inputString("학번 : ");
        String name = inputString("이름 : ");
        int kor = inputScore("국어 점수(0~100) : ");
        int eng = inputScore("영어 점수(0~100) : ");
        int math = inputScore("수학 점수(0~100) : ");

        controller.create(list, studentNo, name, kor, eng, math);
        System.out.println("학생 정보가 추가되었습니다.");
    }

    private void readAll(ScoreController controller, ArrayList<Student> list) {
        System.out.println("\n[전체 조회]");
        ArrayList<Student> students = controller.read(list);

        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        printStudentList(students);
    }

    private void searchStudent(ScoreController controller, ArrayList<Student> list) {
        System.out.println("\n[학생 검색]");

        if (list.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        String keyword = inputString("검색어(학번/이름) : ");
        ArrayList<Student> result = controller.read(list, keyword);

        if (result.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        printStudentList(result);
    }

    private void updateStudent(ScoreController controller, ArrayList<Student> list) {
        System.out.println("\n[학생 수정]");

        if (list.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        printStudentList(list);
        int index = inputInt("수정할 index 입력 : ");

        String studentNo = inputString("새 학번 : ");
        String name = inputString("새 이름 : ");
        int kor = inputScore("새 국어 점수(0~100) : ");
        int eng = inputScore("새 영어 점수(0~100) : ");
        int math = inputScore("새 수학 점수(0~100) : ");

        boolean isUpdated = controller.update(list, index, studentNo, name, kor, eng, math);
        if (isUpdated) {
            System.out.println("학생 정보가 수정되었습니다.");
        } else {
            System.out.println("유효하지 않은 index입니다.");
        }
    }

    private void deleteStudent(ScoreController controller, ArrayList<Student> list) {
        System.out.println("\n[학생 삭제]");

        if (list.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        printStudentList(list);
        int index = inputInt("삭제할 index 입력 : ");

        Student deleted = controller.delete(list, index);
        if (deleted == null) {
            System.out.println("유효하지 않은 index입니다.");
        } else {
            System.out.println("삭제 완료 : " + deleted.getName());
        }
    }

    private int inputInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(SC.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
            }
        }
    }

    private int inputScore(String message) {
        while (true) {
            int score = inputInt(message);
            if (score >= 0 && score <= 100) {
                return score;
            }
            System.out.println("점수는 0~100 사이로 입력해주세요.");
        }
    }

    private String inputString(String message) {
        while (true) {
            System.out.print(message);
            String value = SC.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("빈 값은 입력할 수 없습니다.");
        }
    }

    private void printStudentList(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i));
        }
    }
}