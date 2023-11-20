import java.util.Scanner;

public class Attendence{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int cp=0,ca=0;

		System.out.println("Enter starting No of student\n ");
		int a=sc.nextInt();

		System.out.println("Enter ending No of student\n ");
		int z=sc.nextInt();

		System.out.println("Enter 1 for present and 0 for absent ");
		for(int i=a;i<=z;i++){
			System.out.println("Enter roll No ");
			int roll=sc.nextInt();
			int pre=sc.nextInt();
		}

		switch(pre){
			case: 1{
				cp++;
				break;
			}

			case: 0{
				ca++;
				break;
			}

			default:{
				System.out.println("Enter valid No.");
			}
		}

		System.out.println("Total absent is "+ca);
		System.out.println("Total absent is "+cp);

	}
}