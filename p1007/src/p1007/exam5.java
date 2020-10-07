package p1007;


import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double num,sum=0,i=1;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		do{
			num=s.nextDouble();
			i++;
			sum=sum+num;	
		}
		while(num!=-1);
			System.out.printf("정수의 개수는%2.0f이며 합은 %2.0f이고 평균은 %2.2f입니다.",(i-2),(sum+1),(sum+1)/(i-2));
s.close();	}
}
