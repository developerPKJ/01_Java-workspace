package practice1.model.vo;

public abstract class Animal {
    // field
    private String name;
    private String kinds;

    
    // constructor
    protected Animal() {}

    protected Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }


    // method
    @Override
    public String toString() {
        return "저의 이름은" + name + "이고, 종류는 " + kinds + "입니다.";
    }
    
    public abstract void speak();

}
