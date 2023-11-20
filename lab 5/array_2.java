import java.util.Scanner;

public class array_2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter N ");
		int n=sc.nextInt();

		int a[]=new int[n];
		int sum=0;

		for(int i=0;i<n;i++){
			System.out.println("Enter Element ");
			a[i]=sc.nextInt();
		}


		for(int i=0;i<n;i++){
			if(a[i]%3==0 || a[i]%5==0){
				sum=sum+a[i];
			}
		}

		System.out.println("Total sum is "+sum);
	}
}