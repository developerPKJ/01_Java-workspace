package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {
    public static void main(String[] args) {
        HashMap<Object, Object> hm = new HashMap<>();

        // 1. put(Object key, Object value) : Map 컬렉션에 객체를 저장할 때 사용하는 메소드
        hm.put("name", "홍길동");
        hm.put("age", 20);
        hm.put("gender", '0');
        hm.put("order", '0');


        System.out.println(hm);
        /*
        - 저장 순서가 유지되지 않음
        - Collection 자식 계열은 []로 출력되지만 Map은 {}로 출력됨
        - value 중복 허용, key 중복 허용 안됨
        - 제네릭 설정 전 key value 모두 Object 타입으로 아무거나 저장 가능
        */

        System.out.println("------------------------");

        HashMap<String, Snack> hm2 = new HashMap<>();
        hm2.put("빅파이", new Snack("초코맛", 1500));
        hm2.put("칸쵸", new Snack("바닐라맛", 1200));
        hm2.put("홈런볼", new Snack("초코맛", 1000));
        System.out.println(hm2);
        /*
        - 저장 순서 유지 안됨
        - 제네릭 설정 후 key value 모두 설정된 타입으로만 put 가능
         */

        hm2.put("홈런볼", new Snack("딸기맛", 1100));
        System.out.println(hm2);
        // key는 중복이 불가하기에 기존에 있던 키 값으로 value를 put하면
        // 해당 키 값으로 새로운 value가 덮어씌워짐

        System.out.println("------------------------");

        // 2. get(Object key) : Map 컬렉션에서 해당 key에 대한 value를 반환하는 메소드
        System.out.println(hm2.get("칸쵸"));
        Snack s = hm2.get("빅파이");
        System.out.println(s);
        System.out.println(hm2.get("test")); // 존재하지 않는 key값으로 get하면 null 반환

        System.out.println("------------------------");
        
        // 3. size() : Map 컬렉션에 저장된 key-value 쌍의 개수를 반환하는 메소드
        System.out.println("hm2에 저장된 key-value 쌍의 개수 : " + hm2.size());
        
        System.out.println("------------------------");
        
        // 4. replace(Object key, Object value) : Map 컬렉션에서 해당 key에 대한 value를 새로운 value로 변경하는 메소드
        hm2.replace("칸쵸", new Snack("녹차맛", 1300));
        System.out.println(hm2);
        // put이랑 다를게 뭐냐 : put은 애초에 목적이 데이터를 추가해주는 역할
        // 우연히 중복되면 덮어씌우는 효과 추가
        // 그렇기에 replace는 존재하는 key값으로만 value를 변경할 수 있음
        // 존재하지 않는 key값으로 replace하면 변경할 value가 없기에 null 반환

        System.out.println("------------------------");
        
        // 5. remove(Object key) : Map 컬렉션에서 해당 key에 대한 key-value 쌍을 제거하는 메소드
        hm2.remove("홈런볼");
        System.out.println(hm2);

        System.out.println("-------------------------");

        // Map에 반복문 활용(index 없음)
        // 1. keySet 활용
        // 1-1
        for (String key : hm2.keySet()) {
            System.out.println(key + " : " + hm2.get(key));
        }
        // 1-2
        Set<String> keySet = hm2.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + " : " + hm2.get(key));
        }

        // 2. entrySet() 활용
        // Entry : 집합 형태를 나타내는 일종의 자료형, key와 value가 한 쌍으로 이루어진 자료형(Map의 인터페이스)
        // 2-1 hm2.entrySet() : Map 컬렉션의 key-value 쌍을 Set 컬렉션 형태로 반환하는 메소드
        Set<Entry<String, Snack>> entrySet = hm2.entrySet();
        Iterator<Entry<String, Snack>> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Entry<String, Snack> entry = it2.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // 2-2
        for (Entry<String, Snack> entry : hm2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
