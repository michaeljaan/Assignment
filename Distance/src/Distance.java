//distance class
public class Distance 
{
		private int feet;// instance member
		private double inches;//instance member
		
		public int getFeet()//getter 
		{
			return feet;
		}
		
		public void setFeet(int feet)//setter
		{
			this.feet = feet;
		}
		
		public double getInches()//getter 
		{
			return inches;
		}
		
		public void setInches(double inches)//setter
		{
			this.inches = inches;
		}
		
		public void Display()//display member function
		{
			System.out.println(feet+"feet"+" "+inches+"inches");
			
		}
		
		public int AddFeet(int a,int b)//Addition function
		{
			return feet=a+b;
		}
		
		public double AddInches(double a,double b)
		{
			return inches=a+b;
		}
}
