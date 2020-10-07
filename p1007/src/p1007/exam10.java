package p1007;


import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a,b=1,sum=0;
		System.out.print("1~n까지 합중 5000을 넘지 않는 가장 큰 합?: ");
		a=s1.nextInt();
		do{
			sum=sum+b;
			if(sum>5000){				
				break;
			}
			b++;
		}
		while(b<=a);
		System.out.printf("1부터%d까지의 합은 %d입니다.\n",b-1,sum);
		s1.close();

	}

}
