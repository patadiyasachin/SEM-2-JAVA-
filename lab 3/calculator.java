import java.util.Scanner;

public class calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first No ");
		int a=sc.nextInt();

		System.out.println("Enter second No ");
		int b=sc.nextInt();

		System.out.println("1 for addition");
		System.out.println("2 for substraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for devidation");

		System.out.println("Enter No ");
		int n=sc.nextInt();

		switch(n){
			case 1:
				int add=a+b;
				System.out.println("addition is "+add);
				break;

			case 2:
				int sub=a-b;
				System.out.println("substraction is "+sub);
				break;

			case 3:
				int mult=a*b;
				System.out.println("multiplication is "+mult);
				break;

			case 4:
				int devide=a/b;
				System.out.println("devide is "+devide);
				break;

			default:
				System.out.println("Enter valid no (1 to 4) ");
				break;
		}

	}
}