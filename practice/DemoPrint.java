import java.util.Scanner;
import java.io.*;

public class DemoPrint{
	public static void main(String[] args){
		Scanner sc=null;
		PrintWriter pw=null;
		try{

			sc=new Scanner(new File ("DEMO.txt"));
			pw=new PrintWriter(new File ("DEMO2.txt"));
			// System.out.println("Enter First No ");
			// int n1=sc.nextInt();

			// System.out.println("Enter First No ");
			// int n2=sc.nextInt();

			// int ans=n1+n2;

			while(sc.hasNext()){
				String temp= sc.nextLine();
				// System.out.println(temp);
				pw.println(temp);
			}

			// PrintWriter pw=new PrintWriter(new File ("DEMO2.txt"));
			// pw.print(temp);

		}catch(Exception e){
			e.printStackTrace();
		}

		finally{
			pw.close();
			sc.close();
		}

	}
}