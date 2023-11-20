// some mistake

import java.util.Scanner;
public class Gcd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		GCD gc =new GCD();

		System.out.println("Enter first no ");
		int x=sc.nextInt();

		System.out.println("Enter Second no ");
		int y=sc.nextInt();

		gc.findGcd(x,y);
	}
}

class GCD{
	void findGcd(int a,int b){
		while(a!=0 && b!=0){
			for(int i=1; i<=b; i++){
				if(a%i==0 && b%i==0){
					System.out.println(i);
				}
			}
		}
	}	
}