import java.util.Scanner;

public class Scorcard{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.println(" total five over match per inning");


		int a[][];
		a=new int[5][6];
		int wide=0,no_ball=0,wicket=0,totalrun=0;

		System.out.println("");
		System.out.println("(Enter -60 for wide)");
		System.out.println("(Enter -50 for no ball)");
		System.out.println("(Enter -40 for wicket)");

		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print("Enter runs of "+(i+1)+" over and "+(j+1)+" ball  ");
				a[i][j]=sc.nextInt();

				if(a[i][j]==-60 || a[i][j]==-50){
					j=j-1;
				}
			}
			System.out.println("");
		}


		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]==-60){
					wide++;
				}

				if(a[i][j]==-50){
					no_ball++;
				}

				if(a[i][j]==-40){
					wicket++;
				}

			}
			System.out.println("");
		}

		System.out.println("total wide is "+wide);
		System.out.println("total no ball is "+no_ball);
		System.out.println("total wicket is "+wicket);
		System.out.println("total runs is "+totalrun);
		System.out.println("scorcard is "+totalrun +"/" +wicket);

		System.out.println("\nThanks");

	}
}