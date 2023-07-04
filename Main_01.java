package com.sbs.java.ssg; 
//패키지이름은 가장 윗쪽에 적기
//절대 안바뀌는 정적사이트

import java.util.Scanner;

public class Main_01 {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("명령어)");
		String command = sc.nextLine(); //엔터를 치기전 명령어들 모두 출력됨
		System.out.printf("입력된 명령어 : %s\n", command);
		String command1 = sc.next();
		System.out.printf("입력된 명령어 : %s\n", command1);
		String command2 = sc.next();
		System.out.printf("입력된 명령어 : %s\n", command2);
		
		sc.close();//scanner를 실행할때 마지막에 작성
		
		System.out.println("== 프로그램 끝 ==");
	}
}
