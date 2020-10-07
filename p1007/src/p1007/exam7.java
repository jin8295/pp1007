package p1007;


import java.util.Scanner;

public class exam7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String spell = "";
		System.out.println("exit을 입력하면 종료합니다.");
		while(!(spell.equals("exit"))){
			System.out.print(">>");
			spell=s.next();
		}
		System.out.print("종료합니다...");
		s.close();
	}

}
