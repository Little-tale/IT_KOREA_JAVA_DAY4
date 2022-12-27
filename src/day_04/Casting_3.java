package day_04;
public class Casting_3
{
	public static void main(String[] args) 
	{
		// 정수 + 실수 = 실수
		int intNum =5 ;
		double doubleNum = 12.27;
		System.out.println(intNum + doubleNum);
	
		// 강제 형 변환
		int intVar = 1;
		double doubleVar = 3.14;
		boolean boolVar = true;
		char charVar = 'A';
	
		System.out.println("int");
		System.out.println((double)intVar);
		System.out.println((char)charVar);
		System.out.println(boolVar);
		
		System.out.println(Integer.parseInt("sd"));
	}
}
