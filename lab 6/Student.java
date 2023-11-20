import java.util.Scanner;
public class Student{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Enrollment No");
		long e=sc.nextInt();

		System.out.println("Enter name");
		String s=sc.next();

		System.out.println("Enter gender");
		String ge=sc.next();

		System.out.println("Enter marks");
		int ma=sc.nextInt();


		Student1 s1=new Student1(e,s,ge,ma);
		s1.display();
		Student1 s2=new Student1(e,s,ge,ma);
		s2.display();

	}
}

class Student1{
	long enroll;
	String name;
	String gender;
	int marks;
	int count=0;

		Student1(long enroll,String name,String gender,int marks){
			this.enroll=enroll;
			this.name=name;
			this.gender=gender;
			this.marks=marks;
			this.count++;
		}

		void display(){
			System.out.println("Enrollment No is "+this.enroll);
			System.out.println("Name No is "+this.name);
			System.out.println("gender No is "+this.gender);
			System.out.println("mark No is "+this.marks);		
			System.out.println("counter No is "+this.count);
		}
}
	