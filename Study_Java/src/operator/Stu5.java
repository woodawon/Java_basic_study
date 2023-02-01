package operator;

public class Stu5 {

	public static void main(String[] args) {

		int num = 0;
		System.out.println((num > 0) ?"양수" : (num < 0)  ?"음수" : "0"); // 양수, 음수, 0 판별 코드 -> 삼항 연산자
		
		
		int fahrenheit = 100;
		float celcius = (float)5/9 * (fahrenheit - 32);
		
		System.out.println(fahrenheit);
		System.out.println(String.format("%.2f", celcius)); // Math.round() 외의 다른 방식인 반올림 방법임.
		
	}

}
