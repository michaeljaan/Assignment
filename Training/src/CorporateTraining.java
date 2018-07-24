//Corporate Child Class
public class CorporateTraining extends Training
{

	private int days;//instance member
	private double cost;
	
	public CorporateTraining(int id, String subject, double fees, int days)//constructor
	{
		super(id, subject, fees);
		this.days = days;
	}

	
	public void getOrderValue()//calculate cost
	{
		this.cost=days*getFees();
	}


	public double getCost()//getter 
	{
		return cost;
	}
}
