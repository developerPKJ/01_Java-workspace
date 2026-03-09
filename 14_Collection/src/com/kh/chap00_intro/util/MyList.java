package com.kh.chap00_intro.util;

import java.util.Arrays;

/** Collection 예제
 * > Collection : 다수의 데이터들을 하나의 묶음으로 다루는 자료구조 (데이터 구조)
 * : 여러 개의 데이터를 타입에 상관 없이 배열처럼 저장할 수 있는 구조
 */
public class MyList {
    // field
    // 자료형에 상관 없이 아무 데이터나 저장할 수 있는 배열 = 다형성
    private Object[] arr = new Object[10];
    private int size = 0; // 현재 리스트에 저장된 데이터의 개수
    
    
    // constructor
    public MyList() {}

    public MyList(int length) {
        this.arr = new Object[length];
    }


    // method
    /** 매개변수로 전달받은 item을 arr 배열의 마지막 인덱스에 저장(저장된 위치 기준)
     * add가 될 때마다 size는 1씩 증가
     * > 이미 배열이 가득 찬 경우 arr배열을 깊은 복사 후 사이즈 2배로 생성하고 마지막 인덱스에 저장
     */
    public void add(Object item) {
        if (size == arr.length) {
            this.arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[size++] = item;
    }

    /** 오버로딩 이용 매개변수로 전달받은 item을 arr 배열의 index 번째 칸에 저장
     * 기존의 데이터를 한칸씩 밀어 공간을 확보한 후 저장
     * add가 될 때마다 size는 1씩 증가
     * > 이미 배열이 가득 찬 경우 arr배열을 깊은 복사 후 사이즈 2배로 생성하고 index 번째 칸에 저장
     */
    public void add(int index, Object item) {
        if (size == arr.length) {
            this.arr = Arrays.copyOf(arr, arr.length * 2);
        } else if (index >= arr.length) {
            this.arr = Arrays.copyOf(arr, index * 2);
        } else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("인덱스는 0 이상이어야 합니다.");
        }
        
        if (arr[index] != null) {
            if (arr[arr.length - 1] != null) {
                this.arr = Arrays.copyOf(arr, arr.length * 2);
            }
             for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
        }
        arr[index] = item;
        size++;
    }

    /** 전달 받은 index 번째 칸의 데이터를 item으로 변경
     * index는 현재 값이 있는 인덱스로 제시
     */
    public void set(int index, Object item) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("인덱스는 0 이상이고 배열의 길이보다 작아야 합니다.");
        }
        if (arr[index] == null) {
            throw new IllegalArgumentException("해당 인덱스에는 데이터가 존재하지 않습니다.");
        }
        arr[index] = item;
    }

    /** arr 배열로부터 전달받은 index 번째 데이터를 리턴
     * index는 현재 값이 있는 인덱스로 제시
     */
    public Object get(int index) {
        Object item = null;
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("인덱스는 0 이상이고 배열의 길이보다 작아야 합니다.");
        }
        if (arr[index] == null) {
            throw new IllegalArgumentException("해당 인덱스에는 데이터가 존재하지 않습니다.");
        }
        item = arr[index];

        return item;
    }

    /** arr 배열로부터 전달받은 index번째 데이터를 삭제
     * size는 1씩 감소
     * 삭제된 칸 뒤에 있는 데이터들을 한칸씩 앞으로 당겨서 빈 공간을 없애준다(for)
     * index는 현재 값이 있는 인덱스로 제시
     */
    public void remove(int index) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("인덱스는 0 이상이고 배열의 길이보다 작아야 합니다.");
        }
        if (arr[index] == null) {
            throw new IllegalArgumentException("해당 인덱스에는 데이터가 존재하지 않습니다.");
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = null;
        size--;
    }

    /** arr 배열에 담겨있는 실제 데이터의 갯수를 세서 반환(size 멤버변수) */
    public int size() {
        return this.size;
    }

    /** arr 배열에 담겨있는 데이터가 하나도 없다면 true 있으면 false 반환(size 멤버변수) */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /** toString() 오버라이딩
     * arr 배열의 내용을 [값, 값, 값, ...] 형식으로 문자열로 반환
     * 실제 데이터가 담긴 인덱스까지만 문자열로 반환
     */
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
