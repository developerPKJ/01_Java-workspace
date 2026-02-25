package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {
    public static void main(String[] args) {
        /*
        모든 클래스는 Object 클래스의 후손
        = 최상위 클래스는 항상 Object 클래스
    
        따라서 모든 클래스는 자동으로 Object 클래스의 메소드를 상속받음
        따라서 Object 클래스의 메소드를 재정의(Override)하여 사용할 수 있음
        */
        Book bk = new Book("두잇 자바 프로그래밍", "박은종", 25000);
    
        // address
        System.out.println(bk);
        System.out.println(bk.toString());
        System.out.println();
        System.out.println(bk.information());
        /*
        위 2개의 출력문은 동일한 결과를 출력
        --> 이를 통해 기존에 sysout 괄호 안에 객체명을 작성하면 자동으로 toString() 메소드가 호출되었음
        */
        
        /*
        그런데, 일반 변수처럼 객체명만 작성했을 때 주소값이 출력되는 것이 아닌
        필드 값들이 출력되었으면 좋겠음
        --> Object 클래스의 toString() 메소드를 사용자 클래스에서 재정의하여 사용하면 됨
        */

        /*
        오버라이딩(Overriding)
        상속받고 있는 부모클래스의 메소드를 자식클래스에서 임의로 재정의하는 것
        호출 시 재정의된 자식 메소드가 우선권을 가짐(동적 바인딩)

        오버라이딩의 성립 조건
        1. 부모메소드의 메소드명과 동일
        2. 부모메소드의 매개변수와 동일
        3. 반환형 동일
        4. 매개변수명과는 무관
        5. 부모메소드의 접근제한자보다 같거나 공유 범위가 더 커야 함
        --> 그냥 메소드의 내부 소스코드만 수정한다고 보면 됨 외부 틀은 건들지 말고

        추가 팁
        오버라이딩한 메소드 위에 @Override 어노테이션을 작성하는 것을 권장
        --> 어노테이션은 컴파일러에게 해당 메소드가 오버라이딩된 메소드임을 알려주는 역할
        --> 만약 오버라이딩이 성립되지 않는 경우 컴파일 에러 발생
        +>  명시적으로 확인 가능해서 가독성이 향상
        */
               
        /*
        VO 코드 작성 팁(최종)
        1. 필드는 무조건 private
        2. 기본 생성자 작성
        3. 모든 필드에 대한 매개변수 생성자 작성 - [source] 자동완성기능
        4. 모든 필드에 대한 getter/setter 작성 - [source] 자동완성기능
        5. toString() 메소드 재정의하여 작성 - [source] 자동완성기능
        */
    }

}
