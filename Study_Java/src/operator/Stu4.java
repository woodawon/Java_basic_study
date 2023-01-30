package operator;
import java.util.Scanner;

public class Stu4 {

	public static void main(String[] args) {
		
		// 입력받은 값이 숫자인지 문자인지 알려주기

		Scanner scanner = new Scanner(System.in);
		System.out.println("원하는 값을 하나 입력하세요.");
		
		String input = scanner.nextLine(); // next() 도 String 타입일 때 사용하므로 여기서 사용해도 오류는 나지 않는다. 그러나 nextLine()을 쓴 이유는 nextLine()은 값을 입력받을 때, 띄어쓰기를 무시하고 한 값으로 이어서 받기 때문이다.
		// 그리고 scanner관련 함수에서 char형과 관련된 것은 없는 것 같다. 그래서 string형으로 선언한 후 char로 바꿔주는 듯 하다.
		char ch = ' ';
		ch = input.charAt(0); // char형태로 string형 변수를 바꿔야 밑에서 문자의 유니코드로 판별하여 결과를 낼 수 있게 해주는 코드를 문제 없이 사용할 수 있기 때문에 바꿔줘야 함.
		
		if('0' <= ch && ch <= '9') {
			System.out.println("입력하신 값은 숫자입니다.");
		}
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 값은 문자입니다.");
		}
		scanner.close();
		
	}

}
