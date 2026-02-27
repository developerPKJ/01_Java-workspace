package practice1.run;

import practice1.model.vo.Animal;

public class AnimalManager {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        for (int i = 0; i < animals.length; i++) {
            int j = (int)(Math.random() * 2);   // 0 또는 1
            
            /**
             * 랜덤으로 고양이 혹은 강아지 객체 생성
             */
            if (j == 0) {
                animals[i] = new practice1.model.vo.Cat("야옹이" + 
                (i + 1), "코리안숏헤어", "서울", "회색");
            }else {
                animals[i] = new practice1.model.vo.Dog("멍멍이" + 
                (i + 1), "푸들", (i + 1) * 10);
            }
        }

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
