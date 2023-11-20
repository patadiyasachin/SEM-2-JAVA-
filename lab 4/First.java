import java.util.Scanner;

public class First {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		intrest i1=new intrest();

		System.out.println("Enter p ");
		float p = sc.nextFloat();

		System.out.println("Enter r ");
		float r = sc.nextFloat();

		System.out.println("Enter r ");
		float n = sc.nextFloat();

		System.out.println("ans is "+i1._intrest(p,r,n));


	}
}

class intrest{

	public float _intrest (float p,float r, float n ){
		float res = (p*r*n)/100;
		return  res;
	}




}