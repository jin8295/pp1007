package p1007;


public class exam9 {

	public static void main(String[] args) {
		int i,j;
		int x=1;
		for(i=1;i<=10;i++){
			x=1;
			for(j=1;j<=i;j++){
				  
				System.out.printf("%d",j);
				if(i==j){
					System.out.printf("");
				}else{
					System.out.printf("*");
				}
				x=x*j;
			}
			System.out.printf("=%d\n",x);
			
		}
		
	}

}
