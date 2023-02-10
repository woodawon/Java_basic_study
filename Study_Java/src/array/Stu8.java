package array;

import java.util.Scanner;

public class Stu8 {

	public static void main(String[] args) {

		String[] words = {"apple", "banana", "cookie"};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			
			char tmp = question[i];
			question[i] = question[i + 1];
			question[i + 1] = tmp;
			
			System.out.printf("Q.%d %s의 정답을 입력하세요. : ", i + 1, new String(question));
			String answer = scanner.nextLine();
			
			if (words[i].equals(answer.trim())) {
				System.out.println("맞았어요.\n");
			}
			else {
				System.out.println("틀렸어요.\n");
			}
			
		}
		scanner.close();
	

	}

}