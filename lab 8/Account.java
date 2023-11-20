import java.util.Scanner;

public class Account{
	public static void main(String[] args) {
		Interest i1=new Interest();
		i1.getDetail();
		i1.answer();
	}
}

class Account_Detail{
	double ans,p,r,n;
	void getDetail(){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter p ");
		p=sc.nextInt();

		System.out.println("Enter r ");
		r=sc.nextInt();

		System.out.println("Enter n ");
		n=sc.nextInt();
	}
}

class Interest extends Account_Detail{
	void answer(){
		ans=(p*r*n)/100;
		System.out.println("Interest is "+ans);
	}
}