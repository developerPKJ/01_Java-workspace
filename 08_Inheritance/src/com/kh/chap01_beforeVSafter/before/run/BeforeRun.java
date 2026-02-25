package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {
    public static void main(String[] args) {
        Desktop d = new Desktop("삼성", "d-01", "게이밍데스크탑", 
                                2300000, true);

        Tv t = new Tv("엘지", "t-01", "고오급벽걸이티비", 3500000, 100);

        SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 
                                    1230000, "SKT");

        System.out.println(d);
        System.out.println(t);
        System.out.println(s);

        System.out.println(d.information());
        System.out.println(t.information());
        System.out.println(s.information());

        /*
        이렇게 다른 전자기기를 계속 추가할 수 있음
        하지만 나중에 새로 만들어야할 클래스가 생길때, 공통적으로 갖고 있는 필드들이 있음
        --> 유지보수 작업 효율이 떨어짐

        > 상속이라는 개념 적용 필요
        */
    }
}
