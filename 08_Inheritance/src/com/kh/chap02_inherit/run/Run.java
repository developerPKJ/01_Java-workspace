package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {
    public static void main(String[] args) {
        Airplane a = new Airplane("보잉747", 0.02, 
                                    "여객기", 8, 5);
        System.out.println(a.information());
        
        Car c = new Car("소나타", 12.5, "세단", 4);
        System.out.println(c.information());

        Ship s = new Ship("낚시배", 3, "어선", 1);
        System.out.println(s.information());
    }
}
