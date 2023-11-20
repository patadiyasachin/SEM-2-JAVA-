import java.util.Scanner;

public class array_3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter N ");
		int n=sc.nextInt();

		int a[]=new int[n];
		int flag=0;

		for(int i=0;i<n;i++){
			System.out.println("Enter Element ");
			a[i]=sc.nextInt();
		}

		System.out.println("Enter No to search ");
		int s=sc.nextInt();

		for(int i=0;i<n;i++){
			if(a[i]==s){
				flag=1;
			}

			else{
				
			}
		}

		if(flag==1){
			System.out.println("No found  ");
		}

		else{

			System.out.println("No not found !!! ");
		}


	}
}