import java.util.Scanner;

public class AddTime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("----Enter First time----");


		System.out.println("Enter hour");
		int h1=sc.nextInt();
		System.out.println("Enter minute");
		int m1=sc.nextInt();
		System.out.println("Enter second");
		int s1=sc.nextInt();

		System.out.println("----Enter second time----");


		System.out.println("Enter hour");
		int h2=sc.nextInt();
		System.out.println("Enter minute");
		int m2=sc.nextInt();
		System.out.println("Enter second");
		int s2=sc.nextInt();

		
		Time t1=new Time();
		t1.add( h1, m1, s1, h2, m2, s2);
	}
}

class Time{
	int hour;
	int minute;
	int second;
	int hour2;
	int minute2;
	int second2;

	void add(int h1,int m1,int s1,int h2,int m2,int s2){
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
		System.out.println(h+":"+m+":"+s);
	}
}