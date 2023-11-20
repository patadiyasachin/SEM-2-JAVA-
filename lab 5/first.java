import java.util.Scanner;
public class first{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter N ");
		int n=sc.nextInt();

		int countodd=0,counteven=0;

		int a[]=new int[n];

		for(int i=0; i<n;i++){
			System.out.println("Enter Element ");
			a[i]=sc.nextInt();
		}
		System.out.println("\n");

		for(int i=0; i<n;i++){
			System.out.println("Element is "+a[i]);
		}

		System.out.println("\n");

		for(int i=0;i<n;i++){
			if(a[i]%2==0){
				 counteven++;
			}

			else{
				 countodd++ ;
			}
		}

		System.out.println("total even no is "+counteven);
		System.out.println("total odd no is "+countodd);
	}
}