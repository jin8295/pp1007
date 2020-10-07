package p1007;


import java.util.Arrays;

public class sort1 {

	public static void main(String[] args) {
		int[] numbers=new int[10];
		for(int i=0;i<numbers.length;i++){
			int r=(int)(Math.random()*100);
			numbers[i]=r;
		}
		System.out.print("최초의 리스트: ");
		for(int r1:numbers)
			System.out.print(r1+" ");
			
			Arrays.sort(numbers);
			
		System.out.printf("\n정렬된 리스트: ");
			for(int r2:numbers)
				System.out.print(r2+" ");
	}

}
