package p1007;


import java.util.Scanner;

public class exam6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double [] a=new double[10];
		int sum=0;
		System.out.println("정수 10개 입력하세요. ");
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
			if(a[i]>0){
				sum+=a[i];
			}
			else{
				continue;
			}
		}System.out.printf("양수의 합은:%d",sum);
		s.close();
	}
}