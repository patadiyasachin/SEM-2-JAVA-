import java.util.Scanner;

public class array_1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ce=0 ,co=0;

		System.out.println("Enter No. ");
		int n=sc.nextInt();

		int[] a=new int[n];

		for(int i=0;i<n;i++){
			System.out.println("Enter Element ");
			 a[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++){
			if(a[i]%2==0){
				 ce=ce+1;
			}

			else{
				 co=co+1;
			}
		}

		System.out.println("total even no is "+ce);
		System.out.println("total odd no is "+co);
	}
}