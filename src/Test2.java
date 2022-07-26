import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 영문자 한개를 입력하면 해당 ASCII 코드값을 출력하는 프로그램을 작성하시오
		// 입력 ex. 문자 : A , 출력 ex. 문자 A의 코드값은 65입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String text = sc.nextLine();	// "A"
		char ch = text.charAt(0);		//string "A" 를 char A'로 변환
		
		
		System.out.printf("문자 %c 의 코드값은 %d입니다.", ch, (int)(ch));
		
		
	}
}
