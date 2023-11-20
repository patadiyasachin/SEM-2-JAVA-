import java.util.*;

public class leapyear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter year ");
		int a=sc.nextInt();


		if(a%4==0){
			System.out.println("leap year");
		}

		else{
			System.out.println("Not leap year");
		}
	}
}