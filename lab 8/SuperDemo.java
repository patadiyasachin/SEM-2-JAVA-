import java.util.Scanner;
public class SuperDemo{
	public static void main(String[] args){
		Student s1=new Student();
		s1.print();
	}
}

class Human{
	void print(){
		System.out.println("from Human class");
	}
}

class Student extends Human{
	void print(){
		super.print();
		System.out.println("from Student class");
	}
}