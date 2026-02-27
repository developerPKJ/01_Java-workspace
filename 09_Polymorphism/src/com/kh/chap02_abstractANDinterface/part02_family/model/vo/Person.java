package com.kh.chap02_abstractANDinterface.part02_family.model.vo;

public abstract class Person {
    // field
    private String name;
    private int health;
    private double weight;

    // constructor
    public Person() {
    }

    public Person(String name, int health, double weight) {
        this.name = name;
        this.health = health;
        this.weight = weight;
    }

    // method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", health=" + health +
                ", weight=" + weight;
    }

    /*
    public void eat() {
        System.out.println("밥을 먹는다.");
    }

    public void sleep() {
        System.out.println("잠을 잔다.");
    }
    */

    // 추상 메서드 : 몸통이 없는 메서드, 자식 클래스에서 반드시 오버라이딩 해야하는 메서드
    // 현재 Mother는 interface의 추상메소드 이용중, Baby는 Person의 추상메소드 이용중
    public abstract void eat();
    public abstract void sleep();

}
