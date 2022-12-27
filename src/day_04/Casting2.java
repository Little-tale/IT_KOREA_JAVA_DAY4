package day_04;

public class Casting2 {

	public static void main(String[] args) 
	{
		//int intNum1 = 10L; 리터럴 제한범위를 넘겨 못들어감
		//int intNum2 = 3.7; 같은이유
		//int intNum3	= 3.7f; 얘는 예외임 플롯은 인트와 같은 크기지만 안됨
		
		int intNum4 = 'A';
		//int intNum5	= true; C에서는 되지만 자바에서는 강제적으로 막아놨다고한다.
		//System.out.println(intNum4);
		
		long longNum1 = 10;
		//long longNum2 = 3.7; 또한번의 예외인데 정수형에다가 실수형을 넣는 해석방식이 달라 막음
		
		long longnum3 = 'B';
		//long longNum5 = true; 같은 결과다.
		
		double doubleNum1 = 10;
		double doubleNum2 = 10L; //실수에 정수를 넣는것은 된다 신기하구만
		double doubleNum3 = 10.7f; //0.7을 2진수로 표현하는건 완벽히 구현 불가능하다
									// 그래서 그숫자에 가장 가까운 수로 최대한 2진수로 계산후
									// 최대공간까지 계산후 결과를 출력한다.
									// 즉 float 보단 double을 가장 많이 쓰는 이유가 된다.
		double doubleNum4 = 'a';
		
		char spell1 = 3;
		System.out.println(spell1);
		System.out.println((int)spell1);
		spell1 = 65;
		System.out.println(spell1);
		 
		//char spell2 = 100000;
		//char spell2 = 65L; //롱타입 불가
		// char spell2 = 10.7;
		// char spell2 = 10.7f;
		// char spell2 = true;
		char A= 60;
		System.out.println("테스트 : "+(char)((int)A+(int)spell1));
		
		boolean asd = true; //이놈은 다 안됨 희안함.
		
	}

}
