package com.hw1.model.view;

import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class EmpMenu {
    // field
    private Scanner sc = new Scanner(System.in);

    // constructor
    public EmpMenu() {}

    // method
    public void mainMenu() {
        Employee emp = null;

        while(true) {
            System.out.println("1. 새 사원 정보 등록");
            System.out.println("2. 사원 정보 수정");
            System.out.println("3. 사원 정보 삭제");
            System.out.println("4. 사원 정보 출력");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 번호 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            switch(menu) {
                case 1 : 
                    emp = inputEmployee();
                    System.out.println();
                    break;
                case 2 : 
                    if(emp == null) {
                        System.out.println("등록된 사원 정보가 없습니다. 먼저 사원 정보를 등록해주세요.");
                    } else {
                        modifyEmployee(emp);
                    }
                    break;
                case 3 : 
                    if(emp == null) {
                        System.out.println("등록된 사원 정보가 없습니다. 먼저 사원 정보를 등록해주세요.");
                    } else {
                        emp = null;
                        System.out.println("사원 정보가 삭제되었습니다.");
                    }
                    break;
                case 4 : 
                    if(emp == null) {
                        System.out.println("등록된 사원 정보가 없습니다. 먼저 사원 정보를 등록해주세요.");
                    } else {
                        System.out.println(emp.information());
                    }
                    break;
                case 9 : 
                    System.out.println("프로그램 종료");
                    return;
                default :
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    /**
    // 키보드를 통해 사원 정보를 입력받게끔 구현
    // 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
    // 생성된 객체의 주소 값 반환
    @return Employee 객체
     */
    public Employee inputEmployee() {
        System.out.println("사원명 : ");
        String empName = sc.nextLine();
        System.out.println("부서명 : ");
        String dept = sc.nextLine();
        System.out.println("직급 : ");
        String job = sc.nextLine();
        System.out.println("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("성별 : ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("급여 : ");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.println("보너스 포인트 : ");
        double bonusPoint = sc.nextDouble();
        sc.nextLine();
        System.out.println("전화번호 : ");
        String phone = sc.nextLine();
        System.out.println("주소 : ");
        String address = sc.nextLine();

        return new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
    }

    /**
    // 서브 메뉴 화면 출력 --> 반복 실행 처리
    ==== 사원 정보 수정 메뉴 ====
    1. 이름 변경
    2. 급여 변경
    3. 부서 변경
    4. 직급 변경
    9. 이전 메뉴로
    // 각 번호에 맞춰 변경할 값을 입력 받고 setter 메소드를 이용하여 수정
    @param emp
     */
    public void modifyEmployee(Employee emp) {
            while(true) {
                System.out.println("==== 사원 정보 수정 메뉴 ====");
                System.out.println("1. 이름 변경");
                System.out.println("2. 급여 변경");
                System.out.println("3. 부서 변경");
                System.out.println("4. 직급 변경");
                System.out.println("9. 이전 메뉴로");
                System.out.println("메뉴 번호 선택 : ");
                int menu = sc.nextInt();
                sc.nextLine();
    
                switch(menu) {
                    case 1 : 
                        System.out.println("변경할 이름 입력 : ");
                        String empName = sc.nextLine();
                        emp.setEmpName(empName);
                        System.out.println();
                        break;
                    case 2 : 
                        System.out.println("변경할 급여 입력 : ");
                        int salary = sc.nextInt();
                        sc.nextLine();
                        emp.setSalary(salary);
                        System.out.println();
                        break;
                    case 3 : 
                        System.out.println("변경할 부서 입력 : ");
                        String dept = sc.nextLine();
                        emp.setDept(dept);
                        System.out.println();
                        break;
                    case 4 : 
                        System.out.println("변경할 직급 입력 : ");
                        String job = sc.nextLine();
                        emp.setJob(job);
                        System.out.println();
                        break;
                    case 9 : 
                        System.out.println();
                        return;
                    default :
                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                        System.out.println();
                }
            }   
    }

}
