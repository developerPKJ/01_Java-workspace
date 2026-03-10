package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {
    // 새 곡 추가
    public void create(ArrayList<Music> list, String title, String artist) {
        list.add(new Music(title, artist));
    }

    // 전체 곡 조회
    public void read(ArrayList<Music> list) {
        
    }

    // 특정 곡 검색
    public void read(ArrayList<Music> list, String title) {
        
    }

    // 특정 곡 수정
    public void update(ArrayList<Music> list, int index, String title, String artist) {
        list.set(index, new Music(title, artist));
    }

    // 특정 곡 삭제
    public void delete(ArrayList<Music> list, int index) {
        list.remove(index);
    }
}
