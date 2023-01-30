package variable;
import java.util.Scanner;

public class Stu2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//1
		String input = scanner.nextLine(); // nextLine() 의미 : scanner로 입력값을 입력하게 되고, enter키를 누르면 그 내용이 반환되게 해줌.
		int num = Integer.parseInt(input); // Integer.parseInt() 의미 : ()안의 값을 int형으로 변환함.
		System.out.println("입력한 수 : " + input);
		System.out.println("정수 변환 : " + num);
		
		//2
		int put = scanner.nextInt();
		System.out.println("값 : " + put);
		
		scanner.close();

	}

}
