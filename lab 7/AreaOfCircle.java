import java.util.*;
public class AreaOfCircle{
	public static void main(String[] args) {
		Area a=new Area();
		a.findArea(1.0);
	}
}

class Area{
	void findArea(double rad){
		double ans=Math.PI*rad*rad;
		System.out.println(ans);
	}
}