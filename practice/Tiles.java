import java.util.Scanner;

public class Tiles{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Tiles height in feet");
		int height=sc.nextInt();

		System.out.println("Enter Tiles width in feet");
		int width=sc.nextInt();

		int area=height*width;
		
		System.out.println("Enter Tiles height in  feet");
		int a=sc.nextInt();
		System.out.println("Enter Tiles width in  feet ");
		int b=sc.nextInt();

		int tilesarea=a*b;

		int ans=area/tilesarea;
		System.out.println("Total Tiles You Need is "+ans);
	}
}