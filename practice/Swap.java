import java.util.*;

public class Swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First No.");
		int a=sc.nextInt();

		System.out.println("Enter second No.");
		int b=sc.nextInt();

		int temp;

		temp=a;
		a=b;
		b=temp;

		System.out.println("after swapping ");

		System.out.println("First No is "+a);

		System.out.println("second No is "+b);
	}
}