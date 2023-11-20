import java.util.Scanner;

public class Time{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter First Time ");

		System.out.println("Enter hour");
		int h1=sc.nextInt();

		System.out.println("Enter minute");
		int m1=sc.nextInt();

		System.out.println("Enter second");
		int s1=sc.nextInt();

		System.out.println("Enter Second Time ");

		System.out.println("Enter hour");
		int h2=sc.nextInt();

		System.out.println("Enter minute");
		int m2=sc.nextInt();

		System.out.println("Enter second");
		int s2=sc.nextInt();

		Watch w1=new Watch();
		w1.addTime(h1,m1,s1,h2,m2,s2);
		// w1.printTime();
	}
}

class Watch{
	int hour;
	int minute;
	int second;

	Watch(){
		hour=0;
		minute=0;
		second=0;
	}

	void addTime(int h1,int m1,int s1,int h2,int m2,int s2){
		int h=h1+h2;
		int m=m1+m2;
		int s=s1+s2;

		if(s>=60){
			m++;
			s-=60;
		}

		if(m>=60){
			h++;
			m-=60;
		}
		
		System.out.println("Add time is "+h+":"+m+":"+s);
	}

}