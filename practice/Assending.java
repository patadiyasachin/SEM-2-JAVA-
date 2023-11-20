import java.util.Scanner;
public class Assending{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size of array ");
		int n=sc.nextInt();

		int a[]=new int[n];

		for(int i=0;i<n; i++){
			System.out.println("Enter Element ");
			int num=sc.nextInt();
		}

		int min=a[0];
		for(int i=0;i<n;i++){
			if(min<a[i]){
				System.out.println(" "+a[i]);
			}
		}
	}
}