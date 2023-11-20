import java.util.Scanner;

public class Employee{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Emplooye e1=new Emplooye();

		System.out.println("Enter Emp id");
		int a=sc.nextInt();

		System.out.println("Enter Emp name");
		String b=sc.next();

		System.out.println("Enter Emp designation");
		String c=sc.next();

		System.out.println("Enter Emp age");
		int d=sc.nextInt();

		System.out.println("Enter Emp salery");
		int e=sc.nextInt();

		e1.getEmplooye(a,b,c,d,e);
		e1.displayDetail();

	}
}

class Emplooye{
	int id;
	String name;
	String designation;
	int age;
	int salery;

	void getEmplooye(int id,String name,String designation,int age,int salery){
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.age=age;
		this.salery=salery;
	}	

	void displayDetail(){
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("designation is "+designation);
		System.out.println("age is "+age);
		System.out.println("salery is "+salery);
	}

}