import java.util.Scanner;

public class Stu{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();

		System.out.println("Enter Enrollment No ");
		int a=sc.nextInt();

		System.out.println("Enter name ");
		String b=sc.next();

		System.out.println("Enter sem ");
		int c=sc.nextInt();

		System.out.println("Enter cpi ");
		double d=sc.nextDouble();

		System.out.println("Enter spi");
		double e=sc.nextDouble();

		s1.getStudentDetail(a,b,c,d,e);
		s1.displayStudentDetail();
	}
}


class Student{
	int enr_no;
	String name;
	int sem;
	double cpi;
	double spi;

		void getStudentDetail(int enr_no,String name,int sem,double cpi,double spi){
			this.enr_no=enr_no;
			this.name=name;
			this.sem=sem;
			this.cpi=cpi;
			this.spi=spi;
		}

		void displayStudentDetail(){
			System.out.println("student Enrollment no is "+enr_no);
			System.out.println("student name  is "+name);
			System.out.println("student sem  is "+sem);
			System.out.println("student cpi  is "+cpi);
			System.out.println("student spi  is "+spi);
		}
}