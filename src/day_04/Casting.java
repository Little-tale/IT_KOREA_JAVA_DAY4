package day_04;

import java.util.ArrayList;

public class Casting {

	public static void main(String[] args) {
		double py = 3.1415;
		System.out.println((int)py);
		int word = 65;
		System.out.println((char)word);
		int num  =3;
		long num2 = 3L;
		long fl = num + num2;
		
		//정수 -> 실수
		System.out.println((float)num);
		// 리터럴에 따른 자동형 변환
		final float num1 = 219_319_423_190L; //자동으로 바꿔주지만 이딴식으로하면 
										// 때려쳐라 클린하지 않은 코드다.
		
		System.out.println((double)num1);
		// 정상적으로 롱 선언후 리터럴은 2.1931942319E11 자동형변환시
		//	2.1931941888E11 값이 이렇게 나오는데 자동이든 강제 변환시 이딴 결과가 나오기 쉽다.\
		// 더블이나 인트나 플롯이나 서로 같은 숫자라도 해석방식이 달라 이런 현상이 나온다.
		// 실수 -> 정수
		
		// 오버 플로우 이건 도대체 뭐냐
		byte number = 127;
		System.out.println((byte) (number +1));
		// number에 있는 값에 1을 증가
		System.out.println((byte)-129);
		
		//실수의 오버플로우
		System.out.println((float)123154165123321125123.0);
		
		// 언더 플로우
		System.out.println((float)0.00000000000000000000000000000000000000000000000000001);
	   
		System.out.println(number>>1);
		
	}

}
