package in.com.cg.rmall;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

import in.com.cg.movie.MovieDetails;

public class ParkedCarOwnerList
{
	int token=1,section=1,floor=0;
	Set<ParkedCarOwnerDetails> Car =new LinkedHashSet<>();
	public void addNewCar(ParkedCarOwnerDetails carNo)
	{
			Car.add(carNo);
			System.out.println(carNo.getCarNo() + "  Added @" +token + "th position ," + section +"th Section ," + floor + "th floor."  );
			token++;
			if(token>2) {
				token=1;
				section++;
			}
			if(section>2)
			{
				section=1;
				floor++;
			}
			if(floor>3)
			{
				System.out.println("Parking Full!!!!");
			}	
	}
	
	
	public void removeCar(String carNo)
	{
		Predicate<ParkedCarOwnerDetails> delCarno = ParkedCarOwnerDetails -> ParkedCarOwnerDetails.getCarNo().equals(carNo);
		Car.removeIf(delCarno);
	}
	
	public void Display()
	{
		Consumer<ParkedCarOwnerDetails> disp = ParkedCarOwnerDetails -> System.out.println(ParkedCarOwnerDetails);
		Car.stream().forEach(disp);
	}
	
	public boolean findByNo(String CarNo)//function to search movie by name
	{
		Predicate<ParkedCarOwnerDetails> checkBycarNo= ParkedCarOwnerDetails -> (ParkedCarOwnerDetails.getCarNo().equals(CarNo));//search for entered movie
		return Car.stream().anyMatch(checkBycarNo);//return movie if found
	}
	
	
	
}
