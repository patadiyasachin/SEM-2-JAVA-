import java.util.Scanner;

public class Circle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Radius");
		double rad=sc.nextDouble();

		AreaOfCircle a1=new AreaOfCircle();
		a1.findArea(rad);
		a1.findParimeter(rad);

	}
}

class AreaOfCircle{
	double radius;

	AreaOfCircle(){
		radius=0;
	}

	AreaOfCircle(double radius){
		this.radius=radius;
	}

	void findArea(double radius){
		double ans=(3.14*radius*radius);
		System.out.println("Area is "+ans);
	}

	void findParimeter(double radius){
		double ans2=2*3.14*radius;
		System.out.println("perimeter is "+ans2);
	}
}