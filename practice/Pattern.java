import java.util.Scanner;	
public class Pattern{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		int i,j;
		for(i=1;i<=11;i++){
			for(j=1;j<=11;j++){

				if(i==11 || i==1 ||j==1||j==11){
					System.out.print("6  ");
				}

				else if(i==2 || i==10 ||j==2||j==10){
					System.out.print("5  ");
				}	

				else if(i==3 || i==9 ||j==3||j==9){
					System.out.print("4  ");
				}

				else if(i==4 || i==8||j==4||j==8){
					System.out.print("3  ");
				}

				else if(i==5 || i==7||j==5||j==7){
					System.out.print("2  ");
				}

				else if(i==6 || i==6||j==6||j==6){
					System.out.print("1  ");
				}

			}
			System.out.println("\n");
			
		}
	}
}