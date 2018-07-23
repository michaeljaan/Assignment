public class PersonMain {

	public static void main(String[] args) 
	{
		Person person1=new Person("jaan", 5,6,1995);
		Person person2=new Person("Shyam", 2,2,1998);
		person1.display();
		person2.display();
		person1.olderOne(person1, person2);
	}

}
