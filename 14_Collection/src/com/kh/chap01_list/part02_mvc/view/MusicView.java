package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicView {
    public static Scanner sc = new Scanner(System.in);
    
    public void mainMenu() throws Exception {
        MusicController mc = new MusicController();
        ArrayList<Music> list = new ArrayList<>();
        int index = -1;
        int choice = -1;
        
        while(true) {
            System.out.println("=== 메인 메뉴 ===");
            System.out.println("1. 새 곡 추가");
            System.out.println("2. 전체 곡 조회");
            System.out.println("3. 특정 곡 검색");
            System.out.println("4. 특정 곡 수정");
            System.out.println("5. 특정 곡 삭제");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 번호 선택 : ");
            choice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기
            
            switch (choice) {
                case 1:
                    System.out.println("새 곡을 추가합니다.");

                    System.out.println("곡 제목을 입력하세요: ");
                    String title = MusicView.sc.nextLine();

                    System.out.println("곡 가수를 입력하세요: ");
                    String artist = MusicView.sc.nextLine();

                    mc.create(list, title, artist);

                    System.out.println();
                    break;

                case 2:
                    System.out.println("전체 곡을 조회합니다.");

                    if (list.isEmpty()) {
                        System.out.println("등록된 곡이 없습니다.");
                        break;
                    }

                    for (Music music : list) {
                        System.out.println(music);
                    }

                    System.out.println();
                    break;

                case 3:
                    System.out.println("특정 곡을 검색합니다.");

                    if (list.isEmpty()) {
                        System.out.println("등록된 곡이 없습니다.");
                        break;
                    }

                    System.out.println("검색할 곡 제목을 입력하세요: ");
                    title = MusicView.sc.nextLine();

                    for (Music music : list) {
                        if (music.getTitle().contains(title)) { // 제목에 검색어가 포함되어 있는 경우
                            System.out.println("검색 결과: " + music);
                            break;
                        }
                    }

                    System.out.println("검색 결과가 없습니다.");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("특정 곡을 수정합니다.");

                    if (list.isEmpty()) {
                        System.out.println("등록된 곡이 없습니다.");
                        break;
                    }

                    System.out.println("수정할 곡 index를 입력하세요: ");
                    index = MusicView.sc.nextInt();
                    MusicView.sc.nextLine(); // 버퍼 비우기

                    if (index < 0 || index >= list.size()) {
                        System.out.println("잘못된 index입니다.");
                        break;
                    }

                    System.out.println("새 곡 제목을 입력하세요: ");
                    title = MusicView.sc.nextLine();

                    System.out.println("새 곡 가수를 입력하세요: ");
                    artist = MusicView.sc.nextLine();

                    mc.update(list, index, title, artist);

                    System.out.println();
                    break;
                    
                case 5:
                    System.out.println("특정 곡을 삭제합니다.");

                    if (list.isEmpty()) {
                        System.out.println("등록된 곡이 없습니다.");
                        break;
                    }

                    System.out.println("삭제할 곡 index를 입력하세요: ");
                    index = MusicView.sc.nextInt();
                    MusicView.sc.nextLine(); // 버퍼 비우기

                    if (index < 0 || index >= list.size()) {
                        System.out.println("잘못된 index입니다.");
                        break;
                    }

                    mc.delete(list, index);

                    System.out.println();
                    break;

                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    list.clear();
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }
        }
    }
}
