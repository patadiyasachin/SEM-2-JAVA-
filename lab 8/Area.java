import java.util.Scanner;

public class Area{
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.findArea();

		Triangle t1=new Triangle ();
		t1.findArea();

		Squre s1=new Squre();
		s1.findArea();
	}
}

class Shape{
	Scanner sc=new Scanner(System.in);
}

class Circle extends Shape{
	void findArea(){
		System.out.println("Enter Radius ");
		double rad=sc.nextDouble();

		double ans=Math.PI*rad*rad;
		System.out.println("circle area is "+ans);
	}	
}


class Triangle extends Shape{
	void findArea(){
		System.out.println("Enter base ");
		int base=sc.nextInt();

		System.out.println("Enter height ");
		double height=sc.nextInt();

		double ans=0.5*base*height;
		System.out.println("triangle area is "+ans);
	}
}


class Squre extends Shape{
	void findArea(){
		System.out.println("Enter length ");
		double len=sc.nextDouble();

		double ans=len*len;
		System.out.println("squre area is "+ans);
	}
}