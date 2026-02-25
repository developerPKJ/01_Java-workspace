package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {
    public static void main(String[] args) {
        /*
        자식 / 부모
        후손 / 조상
        하위 / 상위
        서브 / 슈퍼
        */
        Desktop d = new Desktop("삼성", "D-001", "삼성 데스크탑", 
                                1500000, true);
        System.out.println(d.information());

        Tv t = new Tv("LG", "T-001", "LG TV", 
                        2000000, 65);
        System.out.println(t.information());

        SmartPhone s = new SmartPhone("애플", "S-001", "아이폰 14", 
                                        1200000, "SKT");
        System.out.println(s.information());

        /*
        상속특징
        1. 다중 상속 불가 : 부모클래스는 최대 한개
        2. 명시되어 있진 않지만, 모든 클래스는 Object 클래스를 상속받고 있다.
        */
    }
}
