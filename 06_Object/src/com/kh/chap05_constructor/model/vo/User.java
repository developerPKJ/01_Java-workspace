package com.kh.chap05_constructor.model.vo;

public class User {
    // field
    private String userId;      // 아이디
    private String userPwd;     // 비밀번호
    private String userName;    // 이름
    private int age;            // 나이
    private char gender;        // 성별


    // constructor
    /*
    이름이 클래스 명과 동일하고, 반환형이 없는 객체가 생성될 때 호출 되는 메소드
        - 객체가 생성될 때(new)마다 자동으로 호출이 되며, 객체의 초기화 작업을 담당한다.
        - 생성자 메소드도 오버로딩이 가능하다.
        - 단, 매개변수의 자료형과 개수로 구분해야 한다.
        - 생성자 메소드를 "작성하지 않으면" 컴파일러가 자동으로 기본 생성자를 만들어준다.
        (public 클래스명() {} )
    */
    public User() {}                                        // 기본 생성자
    
    public User(String userId, String userPwd, 
                String userName, int age, char gender) {    // 매개변수 생성자
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }

    // userName만 매개변수로 받는 생성자
    public User(String userName) {
        this.userName = userName;
    }

    // userName, age, gender를 매개변수로 받고 일부는 다른 생성자를 다시 호출하는 생성자
    public User(String userName, int age, char gender) {
        this(userName);    // this() : 같은 클래스 내의 다른 생성자 호출
        this.age = age;
        this.gender = gender;

        // this(userName);  // this()는 생성자 내에서 가장 첫 줄에 위치해야 한다.
        //The Java feature 'Flexible Constructor Bodies' is only available with source level 25 and above
    }


    // method
    // getter/setter는 매개변수 생성자가 있더라도, 이 후 필드에 접근하기 위해 + 은닉 원칙을 위해 필요
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    /** return (String) user information */
    public String information() {
        return "아이디 : " + userId + ", 비밀번호 : " + userPwd + 
                ", 이름 : " + userName + ", 나이 : " + age + 
                ", 성별 : " + gender;
    }

}
