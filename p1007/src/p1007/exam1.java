package p1007;


import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("점수를 입력하시오:");
		int score=s.nextInt();
		if(score>=80){
			System.out.println("축하합니다! 합격입니다.");
		}
		else{
			System.out.println("불합격입니다.");
		}s.close();

	}

}
