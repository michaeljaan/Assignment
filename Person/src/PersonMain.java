import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PersonMain 
{

	public static void main(String[] args)throws Exception
	{
		Person person=new Person();
		Person perSon=new Person();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Name of 1st person:");
		String name=scanner.nextLine();
		
		person.setName(name);
		System.out.println("Enter the date of birth in DD/MM/YYYY format:");
		String date=scanner.nextLine();
		//scanner.close();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Calendar dob=Calendar.getInstance();
		dob.setTime(sdf.parse(date));
		person.getAge(dob);
		
		
		System.out.println("Enter Name of 2nd person:");
		name=scanner.nextLine();
		person.setName(name);
		System.out.println("Enter the date of birth in DD/MM/YYYY format:");
		date=scanner.nextLine();
		//scanner.close();
		
		//SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//Calendar dob=Calendar.getInstance();
		dob.setTime(sdf.parse(date));
		perSon.getAge(dob);
		
		System.out.println("First person detail:");
		System.out.println("Name:"+person.getName());
		System.out.println("Date of Birth:"+ person.getDob());
		System.out.println("Age of the person is: "+person.getAge()+" yr"+person.getMonth()+" months"+person.getDay()+" days old");

		System.out.println("Second person detail:");
		System.out.println("Name:"+perSon.getName());
		System.out.println("Date of Birth:"+ perSon.getDob());
		System.out.println("Age of the person is: "+perSon.getAge()+" yr"+perSon.getMonth()+" months"+perSon.getDay()+" days old");
	}

}
