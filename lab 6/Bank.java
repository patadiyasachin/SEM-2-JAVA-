import java.util.Scanner;

public class Bank{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter account no ");
		int act=sc.nextInt();

		System.out.println("Enter username no ");
		String use=sc.next();

		System.out.println("Enter email no ");
		String em=sc.next();

		System.out.println("Enter acttype no ");
		String type=sc.next();

		System.out.println("Enter balance no ");
		double bal=sc.nextDouble();

		BankAccount b1=new BankAccount();
		b1.getAccountDetail(act,use,em,type,bal);
		b1.displayDetail();
	}
}

class BankAccount{
	int actno;
	String username;
	String email;
	String acttype;
	double balance;

	void getAccountDetail(int actno,String username,String emil,String acttype,double balance){
		this.actno=actno;
		this.username=username;
		this.email=email;
		this.acttype=acttype;
		this.balance=balance;
	}

	void displayDetail(){
		System.out.println("Account no is "+this.actno);
		System.out.println("username  is "+this.username);
		System.out.println("emil  is "+this.email);
		System.out.println("acttype  is "+this.acttype);
		System.out.println("balance  is "+this.balance);
	}
}