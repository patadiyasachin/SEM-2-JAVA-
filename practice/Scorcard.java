import java.util.Scanner;
public class Scorcard{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter element of n");
		int n=sc.nextInt();

		int a[];
		a=new int[n];

		for(int i=0;i<a.length; i++){
			System.out.println("Enter Element ");
			int b=sc.nextInt();
		}

		System.out.println("Enter Search Element ");
		int s=sc.nextInt();

		int start=0;
		int mid=a.length/2;
		int end=a.length;
		boolean found=false;

		while(start<=end){
			if(mid<s){
				start=mid+1;
			}

			else if(mid>s){
				end=mid-1;
			}

			else if(mid==s){
				System.out.println("number found at "+mid);
			}

			else{
				System.out.println("Not found !!");
			}

			mid=(start+end)/2;

		}

		if(!found){
			System.out.println("number found at "+mid);
		}

		else{
			System.out.println("Not found !!");
		}
	}
}