import java.util.*;

public class Largest{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter First No :");
		int a=sc.nextInt();


		System.out.print("Enter Second No :");
		int b=sc.nextInt();


		System.out.print("Enter Third No :");
		int c=sc.nextInt();

		if(a>=b && a>=c){
			System.out.println("First is greter");
		}

		else if (b>=c && b>=a){
			System.out.println("Second is greter");

		}

		else{
			System.out.println("Third is greter");
		}
 	}
}