package day_04;

public class Casting4 {

	public static void main(String[] args) {
		System.out.println(3 + 5);
		// 문자열은 +가 연산이 안니 연결
		System.out.println("3" + "5");

		// 다른 자료형 -> 문자열 형변환
		int intVal = 10;
		String intStr = 10 + ""; // "10"
		String douStr = 10.3 + "";
		String floatStr = 10.3f + "";
		String charStr = '가' + "";
		String boolStr = false + "";
		System.out.println(intStr + "\n" + douStr + "\n" + floatStr + "\n" + charStr + "\n" + boolStr + "\n");

		// 문자열 -> 다른 자료형
		int num1 = Integer.parseInt("12516");
		System.out.println(num1);
		/*
		 * int num2 = Integer.parseInt("122.7"); System.err.println(num2);
		 */
		long num2 = Long.parseLong("12341");
		System.out.println(num2);

		double num3 = Double.parseDouble("122.4");
		System.out.println(num3);

		float num4 = Float.parseFloat("10.2");
		System.out.println(num4);

		boolean bool = Boolean.parseBoolean("true");
		System.out.println(bool);

		char spell = "D".charAt(0); // 왜 0만 넣어야 할까 알아보기
		System.out.println(spell);
		System.out.println(spell); // 복사 방법 알트 컨트롤 방향기 위아래

		// 코드 자동 정렬 : 컨트롤 쉬프트 f

	}

}
