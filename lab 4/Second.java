import java.util.Scanner;

public class Second{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		findMax fi = new findMax();

		System.out.println("Enter First No. ");
		int a = sc.nextInt();

		System.out.println("Enter Second No. ");
		int b = sc.nextInt();

		fi.max(a,b);


	}
}


class findMax{
	void max(int a,int b){
		if(a>b){
			System.out.println("first is greater ");
		}

		else if (b>a){
			System.out.println("Second is greater ");
		}

		else{
			System.out.println("equal !! ");
		}
	}
}