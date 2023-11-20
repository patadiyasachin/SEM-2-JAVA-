import java.util.*;

public class table{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter no are you want ");
		int n=sc.nextInt();

		int i;

		for(i=1; i<=10; i++){
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
}