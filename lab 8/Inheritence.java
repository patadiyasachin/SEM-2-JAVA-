import java.util.Scanner;

public class Inheritence{
	public static void main(String [] args){
		Human h1=new Human();
		Student s1=new Student();
		Professior p1=new Professior();
		
		s1.human();
		System.out.println(p1.gender);
		System.out.println(s1.name);
	}
}

class Human{
	String name="sachin";
	String gender="male";
	String hair;
	int age;
	int mobileNo;

	void human(){
		System.out.println("he or she is human from human class ");
	}
}

class Student extends Human{
	int EnrollNo;
	int age;
	String Qualification;

	void print(){
		System.out.println("he is student from student class ");
	}
}

class Professior extends Human{
	int salary;
	String Qualification;
	String suject;

	void Print(){
		System.out.println("he is Professior from Professior class ");
	}
} 