import java.util.Scanner;

public class Classdemo{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);

		student s1= new student(); 
		student s2= new student();  

		s1.name ="sachin";
		s1.rollNo=510;
		s1.enrollnmentNo=2201;
		s1.age=18;

		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		System.out.println(s1.enrollnmentNo);
		System.out.println(s1.age);

		int x,y;

		System.out.println("Enter First NO.");
		x=sc.nextInt();

		System.out.println("Enter Second NO.");
		y=sc.nextInt();

		int ans=s1.add(x,y);
		int ans1=s1.substract(x,y);
		int ans2=s1.multiply(x,y);
		int ans3=s1.devition(x,y);

		System.out.println("addition is "+ans);
		System.out.println("substract is "+ans1);
		System.out.println("multiply is "+ans2);
		System.out.println("devition is "+ans3);

		int p,q;

		System.out.println("Enter First NO.");
		p=sc.nextInt();

		System.out.println("Enter Second NO.");
		q=sc.nextInt();

		int an=s1.add(p,q);
		int an1=s1.substract(p,q);
		int an2=s1.multiply(p,q);
		int an3=s1.devition(p,q);

		System.out.println("addition is "+an);
		System.out.println("substract is "+an1);
		System.out.println("multiply is "+an2);
		System.out.println("devition is "+an3);


	}
}

	 class student{
		String name;
		int rollNo;
		double enrollnmentNo;
		int age;

		int add(int a,int b){
			return a+b;
		}	

		int substract(int a, int b){
			return a-b;
		}

		int multiply(int a,int b){
			return a*b;
		}

		int devition(int a,int b){
			return a/b;
		}
	}