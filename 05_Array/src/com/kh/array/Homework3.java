package com.kh.array;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {

    /**
     * 1~45 사이의 랜덤한 정수 6개 뽑기
     * 6개는 중복 되면 안됨
     * 오름차순으로 정렬 - Arrays.sort()
     * 최종적으로 뽑인 숫자를 이쁘게 출력(toString)
     */
    public void method13() {
        Random rand = new Random();
        int[] lottoNum = new int[6];

        for (int i = 0; i < lottoNum.length; i++) {         //6개 채울 때까지 반복
            lottoNum[i] = rand.nextInt(45) + 1;     //1부터 45까지 랜덤한 정수 1개

            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (lottoNum[i] == lottoNum[j]) {       //배열에 동일한 값 존재시 다시뽑기
                        i--;
                        break;
                    }
                }
            }
        }
        Arrays.sort(lottoNum);      //오름차순 정렬

        System.out.println(Arrays.toString(lottoNum));      //배열 출력(toString)
    }

}
