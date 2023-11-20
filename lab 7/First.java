import java.util.Scanner;

public class First{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Demo d1=new Demo();

		d1.Print();

	}
}

class Demo{
	int i=5;

	static void Print(){
		System.out.println(this.i);
	}
}


// this will generate error