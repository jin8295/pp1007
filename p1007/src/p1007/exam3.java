package p1007;


import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String score;
		System.out.print("학점을 입력하세요.(A~D,F):");
		score=s.next();
		switch(score){
		case "A":
		System.out.print("참 잘하였습니다.");
		break;
		case "B":
			System.out.print("참 잘하였습니다.");
			break;
		case "C":
			System.out.print("좀 더 노력하세요.");
			break;
		case "D":
			System.out.print("좀 더 노력하세요.");
			break;
		case "F":
			System.out.print("다음 학기에 다시 수강하세요.");
			break;
			default:
				System.out.print("잘못된 학점입니다.");
				break;
		}s.close();

	}

}
