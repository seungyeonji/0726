import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student jimin = new Student();	//StudentInfo2에 이미 Student 클래스를 만들어놨음
		
		System.out.print("학번 : ");
		jimin.hakbun = sc.nextLine();		
		System.out.print("이름 : ");
		jimin.name = sc.nextLine();		
		System.out.print("국어 : ");
		jimin.kor = sc.nextInt();		
		System.out.print("영어 : ");
		jimin.eng = sc.nextInt();		
		System.out.print("수학 : ");
		jimin.mat = sc.nextInt();
		
		
		
		int total = jimin.kor + jimin.eng + jimin.mat;
		double avg = total / 3.;
		
		System.out.printf("학번 : %s\n", jimin.hakbun);
		System.out.printf("이름 : %s\n", jimin.name);
		System.out.printf("국어 : %d\n", jimin.kor);
		System.out.printf("영어 : %d\n", jimin.eng);
		System.out.printf("수학 : %d\n", jimin.mat);
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f ", avg);
		
	}
}
