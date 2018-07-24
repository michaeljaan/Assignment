//Training main
public class TrainingMain
{

	public static void main(String[] args) 
	{
		Training training=new PublicTraining(1,"java", 5000,50);//object 1
		Training training1=new CorporateTraining(2,"BigData", 35000,4);//object 2
				
		training.getOrderValue();//invoking member function for calculating cost  
		System.out.println("The Total Cost of java Training is:"+training.getCost());//display cost
		training1.getOrderValue();//invoking member function for calculating cost
	
		System.out.println("The Total Cost of BigData Training is:"+training1.getCost());//display cost
		
	}

}
