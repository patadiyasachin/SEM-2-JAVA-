import java.util.Scanner;
public class ForwardMethod{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("------------------ENTER ENY DATA FOR FORWARD AND BACKWARD METHOD------------------");	

		System.out.println("Enter find number ");
		int find=sc.nextInt();

		System.out.println("Enter total data size ");
		int size=sc.nextInt();
		float [] x=new float[size];
		float [] y=new float[size];

		for(int i=0;i<size;i++){
			System.out.println("Enter data for x ");
			x[i]=sc.nextFloat();
		}

		System.out.println("\n");

		for(int j=0;j<size;j++){
			System.out.println("Enter data for y=f(x) ");
			y[j]=sc.nextFloat();
		}

		switch(size){
			case 4:{
				float dely0=y[1]-y[0];
				float dely1=y[2]-y[1];
				float dely2=y[3]-y[2];
				
				// System.out.println(dely0);
				// System.out.println(dely1);
				// System.out.println(dely2);

				float dely2y=dely1-dely0;
				float dely2yy=dely2-dely1;

				// System.out.println(dely2y);
				// System.out.println(dely2yy);

				float del3y=dely2yy-dely2y;
				// System.out.println(del3y);

				float h=x[1]-x[0];
				float p=(find-x[0])/h;

				float ans;
				ans=y[0]+p*dely0+(p*(p-1)/2)*(dely2y)+(p*(p-1)*(p-2)/6)*(del3y);
				System.out.println("\nfinal ans is "+ans);
				break;
			}

			case 5:{
				float dely0=y[1]-y[0];
				float dely1=y[2]-y[1];
				float dely2=y[3]-y[2];
				float dely3=y[4]-y[3];
				
				// System.out.println(dely0);
				// System.out.println(dely1);
				// System.out.println(dely2);

				float dely2y=dely1-dely0;
				float dely2yy=dely2-dely1;
				float dely2yyy=dely3-dely2;

				// System.out.println(dely2y);
				// System.out.println(dely2yy);

				float del3y=dely2yy-dely2y;
				float del3yy=dely2yyy-dely2yy;
				// System.out.println(del3y);

				float del4y=del3yy-del3y;

				float h=x[1]-x[0];
				float p=(find-x[0])/h;

				float ans;
				ans=y[0]+p*dely0+(p*(p-1)/2)*(dely2y)+(p*(p-1)*(p-2)/6)*(del3y)+(p*(p-1)*(p-2)*(p-3)/24)*(del4y);
				System.out.println("\nfinal ans is "+ans);
				break;
			}

		case 6:{
				float dely0=y[1]-y[0];
				float dely1=y[2]-y[1];
				float dely2=y[3]-y[2];
				float dely3=y[4]-y[3];
				float dely4=y[5]-y[4];
				
				// System.out.println(dely0);
				// System.out.println(dely1);
				// System.out.println(dely2);

				float dely2y=dely1-dely0;
				float dely2yy=dely2-dely1;
				float dely2yyy=dely3-dely2;
				float dely2yyyy=dely4-dely3;

				// System.out.println(dely2y);
				// System.out.println(dely2yy);

				float del3y=dely2yy-dely2y;
				float del3yy=dely2yyy-dely2yy;
				float del3yyy=dely2yyyy-dely2yyy;
				// System.out.println(del3y);

				float del4y=del3yy-del3y;
				float del4yy=del3yyy-del3yy;

				float del5y=del4yy-del4y;

				float h=x[1]-x[0];
				float p=(find-x[0])/h;

				float ans;
				ans=y[0]+p*dely0+(p*(p-1)/2)*(dely2y)+(p*(p-1)*(p-2)/6)*(del3y)+(p*(p-1)*(p-2)*(p-3)/24)*(del4y)+(p*(p-1)*(p-2)*(p-3)*(p-4)/120)*(del5y);
				System.out.println("\nfinal ans is "+ans);
				break;
			}

			default:{
				System.out.println("INVALID INPUT DATA SIZE !!!!!!!!");	
			}
		}		
	}
}