package com.sbs.java.Exam_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
public class Main_01 {
	public static void main(String[] args) {
			System.out.println("== 프로그램 시작 ==");
			Scanner sc = new Scanner(System.in);

			int lastArticleId = 0;
			List<Article> articles = new ArrayList<>();

			while (true) {
				System.out.printf("명령어) ");
				String command = sc.nextLine();
				command = command.trim();

				if (command.length() == 0) {
					continue;
				}

				if (command.equals("system exit")) {
					break;
				} else if (command.equals("article write")) {
					int id = lastArticleId + 1;
					lastArticleId = id;
					System.out.printf("제목 : ");
					String title = sc.nextLine();
					System.out.printf("내용 : ");
					String body = sc.nextLine();

					Article article = new Article(id, title, body);
					articles.add(article);

					System.out.printf("%d번 글이 생성되었습니다.\n", id);
				} else if (command.equals("article list")) {
					if (articles.size() == 0) {
						System.out.println("게시물이 없습니다.");
						continue;
					}

					System.out.println("번호 | 제목");
					for (int i = articles.size() - 1; i >= 0; i--) {
						Article article = articles.get(i);

						System.out.printf("%3d, %s\n", article.id, article.title);
					}
				} else if (command.startsWith("article detail")) {
					String[] commandBits = command.split(" ");
					int id = Integer.parseInt(commandBits[2]);

					boolean found = false;
					Article foundArticle = null;

					for (int i = 0; i < articles.size(); i++) { //articles 뒤져서 나옴
						Article article = articles.get(i);

						if (article.id == id) { //id의 게시물을 찾아서 통제로 foundArticle에 넣어!
							found = true; //게시물 찾음
							foundArticle = article;
							break;
						}
					}

					if (foundArticle == false) {
						System.out.printf("%d번 게시물은 존재하지 않는 게시물입니다.\n", id);
						continue;
					}
				}

				else {
					System.out.printf("%s(은)는 존재하지 않는 명령어 입니다.\n", command);
					System.out.printf("번호 : %d\n", foundArticle.id);
					System.out.printf("날짜 : %s\n", "2023-07-05");
					System.out.printf("제목 : %s\n", foundArticle.title);
					System.out.printf("내용 : %d\n", foundArticle.body);
				}
			}

			sc.close();
			System.out.println("== 프로그램 끝 ==");
		}
	}

/*
번호 : 1
날짜 : 2023.07.05
제목 : ~~~~~
내용 : ~~~~~
*/

class Article {
		int id;
		String title;
		String body;

		public Article(int id, String title, String body) {
			this.id = id;
			this.title = title;
			this.body = body;
		}
	}
}
