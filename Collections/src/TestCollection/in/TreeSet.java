package TestCollection.in;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet
{
	public static void main(String[] args)
	{
		Set<Object> tree=new TreeSet();
		
		tree.add("mike");
		tree.add("Jaan");
		tree.add("Roger");
		tree.add("Federer");
		tree.add("Rafael");
		tree.add("Nadal");
		
		tree.stream().forEach((tree1) -> System.out.println(tree1));

	}
}
