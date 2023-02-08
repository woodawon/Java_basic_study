package if_loop;

import java.util.Scanner;

public class Stu6 {

	public static void main(String[] args) {

		System.out.println("원하는 월을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch (month) {
			case 3: case 4: case 5: {
				System.out.println("봄이네요.");
				break;
			}
			case 6: case 7: case 8: {
				System.out.println("여름이네요.");
				break;
			}
			case 9: case 10: case 11: {
				System.out.println("가을이네요.");
				break;
			}
			case 12: case 1: case 2: {
				System.out.println("겨울이네요.");
				break;
			}
			default:
				System.out.println("월에 해당하는 수가 맞나요?");
			}
		
		scanner.close();

	    }

}
