
public class Time {
	int hours;
	int minutes;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) 
	{
		if(hours>0 && hours<24)
		{
		this.hours = hours;
		}
	}
	public int getMinutes()
	{
		return minutes;
	}
	public void setMinutes(int minutes) 
	{
		if(minutes>0 && minutes <60)
		{
		this.minutes = minutes;
		}
	}
	
	public int addHours(int hour, int hours)
	{
		return hour+hours;
	}
	public int addMin(int min, int minute)
	{
		return min+minute;
	}
	
	public void Display(int hour, int minute) 
	{
		System.out.println(hour+":"+minute);
	}
	
}
