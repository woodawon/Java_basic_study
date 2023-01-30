package operator;

public class Stu3 {

	public static void main(String[] args) {

		//산술 변환
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000L * 1_000_000; // 산술 변환의 개념에 의해, 이항 연산자인 값들 중에서 최소 하나는 꼭 같은 타입으로 형변환을 해놔야 손상된 값이 아닌 제대로 된 값으로 나올 수 있음.
		
		System.out.println(a);
		System.out.println(b);
		
		//반올림
		double pi = 3.141592;
		double new_pi = Math.round(pi * 1000) / 1000; 
		// 1000을 곱하고 다시 나누는 이유? : 소수 첫 번째 말고 다른 자리 반올림을 하고 싶을 땐, 그 자리가 반올림이 될 수 있게 점 위치를 곱하기로 옮겨주고, 반올림을 math.round로 해준 후에, 그 수를 다시 나누기해서 점이 원래 있던 위치에 가도록 다시 옮겨주는 것이다.
		// 그렇게 해주면, 마치 다른 자리 번째 숫자 반올림의 결과처럼 이쁘게 잘 나올 수 있게 되는 것.
		System.out.println(new_pi);
		
		// 나누고 빼기를 하지 않았기 때문에 첫 번째 자리에서 반올림 된다.
		System.out.println(Math.round(4.135));
		System.out.println(Math.round(4.635));

	}

}
