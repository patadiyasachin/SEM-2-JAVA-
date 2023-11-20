import java.util.Scanner;

public class Third{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter length");
		int len=sc.nextInt();

		System.out.println("Enter width");
		int wid=sc.nextInt();

		Rectangal r=new Rectangal();
		Rectangal t=new Rectangal(len,wid);
		Rectangal s=new Rectangal(t);	

		r.findArea();
		t.findArea();
		s.findArea();
		// r.printArea();
	}
}

class Rectangal{
	 int length;
	 int width;
	 // static count=0;

	Rectangal(){
		length=1;
		width=1;
	}

	Rectangal(int length,int width){
		this.length=length;
		this.width=width;
	}

	Rectangal(Rectangal r1){
		length=r1.length;
		width=r1.width;
	}

	void findArea(){
		int res=length*width;
		System.out.println("area is "+res);
	}
}