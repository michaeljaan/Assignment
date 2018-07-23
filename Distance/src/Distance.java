public class Distance {
		private int feet;
		private double inches;
		
		public int getFeet() {
			return feet;
		}
		public void setFeet(int feet) {
			this.feet = feet;
		}
		public double getInches() {
			return inches;
		}
		public void setInches(double inches) {
			this.inches = inches;
		}
		public void Display()
		{
			System.out.println(feet+"feet"+" "+inches+"inches");
			
		}
		public int AddFeet(int a,int b)
		{
			return feet=a+b;
		}
		public double AddInches(double a,double b)
		{
			return inches=a+b;
		}
}
