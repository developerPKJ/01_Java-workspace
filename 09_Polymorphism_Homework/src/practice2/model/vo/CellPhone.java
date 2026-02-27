package practice2.model.vo;

// ***주의*** interface가 interface를 상속받을 때는 extends 키워드를 사용한다.
public interface CellPhone extends Phone, Camera {
    void charge();
}
