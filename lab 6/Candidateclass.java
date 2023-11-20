import java.util.Scanner;

public class Candidateclass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		candidate o1=new candidate();

		System.out.println("Enter candidate id ");
		int id=sc.nextInt();

		System.out.println("Enter candidate name ");
		String na=sc.next();

		System.out.println("Enter candidate age ");
		int ag=sc.nextInt();

		System.out.println("Enter candidate weight ");
		int we=sc.nextInt();

		System.out.println("Enter candidate height ");
		double he=sc.nextDouble();

		o1.getCnadidateDetail(id,na,ag,we,he);
		o1.displayDetail();
	}
}

class candidate{
	int cid;
	String name;
	int age;
	int weight;
	double height;

	void getCnadidateDetail(int cid,String name,int age,int weight,double height){
		this.cid=cid;
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;

	}

	void displayDetail(){
		System.out.println("id is "+this.cid);
		System.out.println("name is "+this.name);
		System.out.println("age is "+this.age);
		System.out.println("weight is "+this.weight);
		System.out.println("height is "+this.height);
	}
}