import java.util.Scanner;

public class Palingdrom{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter string to check");
		String s=sc.next();	

		StringBuffer str=new StringBuffer(s);

		StringBuffer ne=str.reverse();
		String reverse_string=ne.toString();

		if(s.equals(reverse_string)){
			System.out.println("Palingdrom");
		}

		else{
			System.out.println("not Palingdrom !!!!");
		}
	}
}