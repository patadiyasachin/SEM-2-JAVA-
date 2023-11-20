import java.util.Scanner;

public class Third{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		prime pr=new prime();

		System.out.println("Enter no check prime or not ");
		int a=sc.nextInt();

		System.out.println("ans is " + pr.check(a));
	}
}

class prime{
	int check (int n){
		int flag=0;

		for(int i=2; i<=n/2; i++){
			if(n%i==0){
				flag = 1;
				break;
			}
		}

		if(flag==0){
			return 1;
		}

		else{
			return 0;
		}
	}
}