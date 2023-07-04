package com.sbs.java.ssg; 
//패키지이름은 가장 윗쪽에 적기
//절대 안바뀌는 정적사이트

import java.util.Scanner;

public class Main_01 {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			System.out.println("명령어)");
			String command = sc.nextLine(); //sc.nextLine();엔터를 치기전 명령어들 모두 출력됨
			command = command.trim(); //앞에 엔터 공백이 있어도 출력이 됨(공백있으면 출력이상해지는데!)
			
			if(command.length() == 0){
				continue; //사용가자 입력을 안하면 계속 명령어) 이거나옴
			}
			
			if(command.equals("system exit")) {
				break; //영원히 실행됨
			}
			else if( command.equals("article list")) {
				System.out.println("게시물이 없습니다.");
			}
			else {
				System.out.printf("%s(은)는 존재하지 않는 명령어 입니다.\n", command);
			}
		}
		
		sc.close();//scanner를 실행할때 마지막에 작성
		
		System.out.println("== 프로그램 끝 ==");
	}
}
