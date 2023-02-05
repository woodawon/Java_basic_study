package if_loop;

import java.util.Iterator;

public class Stu7 {

	public static void main(String[] args) {

		Loop1 : for (int i = 2; i <= 9; i++) { // for문의 이름을 정해준 것
			for(int j = 1;j <= 9;j++) {
				if(j == 5) {
					break Loop1; 
				}
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}

	}

}
