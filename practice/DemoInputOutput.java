import java.io.*;
public class DemoInputOutput{
	public static void main(String[] args) {

		try{
			FileInputStream fin=new FileInputStream("DEMO.txt");
			// FileOutputStream fout=new FileOutputStream("ab.txt");
			// String s="akdjfaj;kfjasdk;fj akdjfa;kf akjdfka;f";
			// byte b[]=s.getBytes();
			// fout.write();
			// fout.close();
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}