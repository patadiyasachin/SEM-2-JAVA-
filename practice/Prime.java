import java.util.Scanner;

public class Prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindPrime f1=new FindPrime();
		f1.prime();

	}
}

class FindPrime{

	void prime(){
		int flag=0;
		
		for(int i=2;i<100;i++){
			for(int j=2;j<i;j++){
				if(j%i==0){
						 flag=0;
				}
			}
		}

		for(int i=2;i<100;i++){
			for(int j=2;j<100;j++){
				if(flag!=0){
					System.out.println("prime no "+flag);
				}
			}
		}
	}	
}