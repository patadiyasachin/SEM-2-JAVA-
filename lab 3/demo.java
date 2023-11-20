import java.util.Scanner;

public class demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size ");
		int n=sc.nextInt();

		int a[];
		a=new int[n];

		int i;
		for(i=0;i<n;i++){
			System.out.println("Enter "+(i+1) +" Element");
			a[i]=sc.nextInt();
		}

			for(i=0;i<n;i++){
			System.out.println(a[i]);
		}


	}
}