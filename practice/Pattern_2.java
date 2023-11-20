import java.util.Scanner;	
public class Pattern_2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		int i,j;
		System.out.print("Enter odd number: ");
		int n=sc.nextInt();

		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){

				if(i==n || i==(n-10) ||j==(n-10)||j==n){
					System.out.print("6 ");
				}

				else if(i==(n-9) || i==(n-1) ||j==(n-9)||j==(n-1)){
					System.out.print("5 ");
				}	

				else if(i==(n-8) || i==(n-2) ||j==(n-8)||j==(n-2)){
					System.out.print("4 ");
				}

				else if(i==(n-7) || i==(n-3)||j==(n-7)||j==(n-3)){
					System.out.print("3 ");
				}

				else if(i==(n-6) || i==(n-4)||j==(n-6)||j==(n-4)){
					System.out.print("2 ");
				}

				else if(i==(n-5) || i==(n-5)||j==(n-5)||j==(n-5)){
					System.out.print("1 ");
				}

			}
			System.out.print("\n");
			
		}
	}
}