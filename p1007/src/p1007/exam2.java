package p1007;


import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String score;
		System.out.print("학점을 입력하세요: ");
		score=s.next();
		if(score.equals("A")){
			System.out.print("참 잘하였습니다.");
		}
		else if(score.equals("B")){
			System.out.print("참 잘하였습니다.");
		}
		else if(score.equals("C")){
			System.out.print("좀 더 노력하세요.");
		}
		else if(score.equals("D")){
			System.out.print("좀 더 노력하세요.");
		}
		else if(score.equals("F")){
			System.out.print("다음 학기에 다시 수강하세요.");
		}
		else{
			System.out.print("잘못된 학점입니다.");
		}s.close();
	}

}
