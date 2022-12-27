package day_04;

import java.util.Scanner;
// 자동 임포트 단축키 : 컨트롤 쉬프트 o
public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name);
		String intro = sc.next();
		sc.nextLine();
		System.out.println(intro);
		String nul = null ;
		nul = sc.nextLine();
		System.out.println(nul);
		sc.nextLine(); // 넥스트 라인 같은 경우에는 버퍼에 엔터도 같이 입력되버리는데 그걸 방지하기위해 입력함
						// 이현상은 넥스트 직후 라인을 쓸경우에 나옴.김
		String lastName = sc.next();
	}

}
