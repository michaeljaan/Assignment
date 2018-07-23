package rectangle;
public class RectangleMain {

	public static void main(String[] args) {
		rectangle rect1=new rectangle();
		rectangle rect2=new rectangle();
		rect1.breadth=2;
		rect1.length=10;
		rect2.breadth=20;
		rect2.length=30;
		int area1=0;
		int area2=0;
		area1=rect1.Area(rect1.breadth, rect1.length);
		area2=rect2.Area(rect2.breadth, rect2.length);
		if(area1==area2)
		{
			System.out.println("Area of Both the Rectangles are equal: ");
		}
		else
			System.out.println("Area are different.");

}
}
