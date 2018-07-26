//main function
public class GameDemo 
{
	public static void perform(Game game)//function to invoke methods
	{
		game.play();
	}
	public static void main(String[] args)
	{
		Game game[]=new Game[3];//create an object having a reference type game(interface)
		game[0]=new Cricket();//class
		game[1]=new Tennis();
		game[2]=new Football();
		
		for(int i=0;i<3;i++)
		{
			perform(game[i]);//invoking function 
		}
	}

}
