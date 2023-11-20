import java.util.Scanner;
public class Reverce{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[];

		System.out.println("Enter N :");
		int n=sc.nextInt();

		int i;
		for(i=0 ; i<n; i++){
			System.out.print("Enter Element: ");
			int a[i]=sc.next();
		}

		System.out.println("In reverce order");

		for(i=n; i>=0; i--){
			System.out.println(a[i]);
		}
	}
}