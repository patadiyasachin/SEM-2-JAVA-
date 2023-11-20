import java.util.*;

public class Calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First No.");
		int a=sc.nextInt();

		System.out.println("Enter second No.");
		int b=sc.nextInt();

		System.out.println("1 for addition");
		System.out.println("2 for substraction");
		System.out.println("3 for multipli");
		System.out.println("4 for devidation");

		int c=sc.nextInt();

		switch(c)
		{
		case 1 : 
			int sum;
			sum=a+b;
			System.out.println("sum is: "+sum);
			break;

		case 2:
			int sub;
			sub=a-b;
			System.out.println("substraction is: "+sub);
			break;

		case 3:
			int multi;
			multi=a*b;
			System.out.println("multiplication is: "+multi);
			break;

		case 4:
			int devide;
			devide=a/b;
			System.out.println("devidation is: "+devide);
			break;
		}
	}
}