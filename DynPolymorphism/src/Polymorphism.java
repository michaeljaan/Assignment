//Main function
public class Polymorphism {

	public static void main(String[] args) 
	{
		top1 var=new Bottom1();//object 1
		top1 var2=new Bottom2();//object2
		top1 var3=new Bottom3();//object3
		Bottom3 var4=new Bottom3();//object4
		
		var.disp1();
		var2.disp1();
		var3.disp1();
		var4.disp1();

	}

}
