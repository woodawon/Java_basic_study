package variable;

public class Stu1 {

	public static void main(String[] args) {
		
		String url = "www.code.com";
		String str = "3";
		String str2 = "3.14";
		Character chr = '3';
		
		// 'printf'인 이유 => specifier(지시자)로 밑의 코드들이 에러 없이 출력될 수 있게 형식을 변환함.
		// '%n' 인 이유 => \n으로 할 수 있으나, %n이 더 안전함.
		// %s : 지시자
		System.out.printf("%s %n", url);
		System.out.printf("%20s %n", url); // 왼쪽 공간 생김
		System.out.printf("%-20s %n", url); // 오른쪽 공간 생김
		System.out.printf("%.8s %n", url); // 왼쪽 글자에서 8글자만 출력
		
		System.out.println((char)(3 - 1)); // 3 - 1의 결과인 int형 값을 char 형으로 변환해 출력
		System.out.println('4' - '2'); // 문자 끼리의 값을 저런 식으로 int형 값끼리의 계산처럼 하면 값이 int형으로 나옴
		System.out.println(4 + ""); // int형 값을 str형으로 변환하여 출력
		System.out.println(Integer.parseInt(str)); // str값을 int형으로 바꿔서 출력
		System.out.println(Double.parseDouble(str2)); // str값을 double형으로 바꿔서 출력
		System.out.println(str.charAt(0)); // str을 char형으로 바꿔서 출력
		System.out.println(chr + ""); // char형을 str형으로 바꿔서 출력


	}

}