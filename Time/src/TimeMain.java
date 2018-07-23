import java.util.Scanner;
public class TimeMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Time time=new Time();
		Time timE=new Time();
		Time sum=new Time();
		
		int hour,minutes;
		
		System.out.println("Enter the 1st Timing in HH:MIN format:");
		hour=scanner.nextInt();
		time.setHours(hour);
		minutes=scanner.nextInt();
		time.setMinutes(minutes);
		
		System.out.println("Enter the 2nd Timing in HH:MIN format:");
		hour=scanner.nextInt();
		timE.setHours(hour);
		minutes=scanner.nextInt();
		timE.setMinutes(minutes);
		
		sum.hours=sum.addHours(time.hours,timE.hours);
		sum.minutes=sum.addMin(time.minutes, timE.minutes);
		
		System.out.println("The 1st Time in HH:MM format is:");
		time.Display(time.hours,time.minutes);
		
		System.out.println("The 2nd Time in HH:MM format is:");
		timE.Display(timE.hours,timE.minutes);
		
		System.out.println("The 3rd Time in HH:MM format is:");
		sum.Display(sum.hours,sum.minutes);
		
		
		

	}

}
