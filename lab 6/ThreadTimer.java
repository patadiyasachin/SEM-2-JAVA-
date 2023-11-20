import java.util.Scanner;

public class ThreadTimer{
	public static void main(String[] args) {
		// try{
		// 	System.out.println("hello");
		// 	Thread.sleep(800);
		// 	System.out.println("world");
		// }
		// catch(Exception e){

		// }
		Timer t1=new Timer();
		t1.timing(5,90,70);
		t1.printTime();

	}
}

class Timer{
	int hour;
	int minute;
	int second;

	void timing(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;

		while(true){
			this.minute+=minute;
			if(second>59){
				minute++;
				second-=60;
			}

			this.hour+=hour;
			if(minute>59){
				hour++;
				minute-=60;
			}

			this.second+=second;
			if(second>0){
				second--;
				try{
					Thread.sleep(1000);
				}

				catch(Exception e){

				}
				System.out.println(hour+":"+minute+":"+second);
			}

			else{
				break;
			}

			if(minute>0){
				second+=60;
				minute--;
			}
		}
	

		// System.out.println(hour+":"+minute+":"+second);
	
	}

	void printTime(){
		
	}
}