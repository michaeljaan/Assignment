import java.util.Scanner;
public class TelevisionMain {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		Television Remote=new Television("OFF", 1, 10);
		int volume,channel;
		
		System.out.println("Switch ON/OFF");
		String state=scanner.nextLine();
		Remote.setState(state);
		if(state.equals("ON"))
		{
			System.out.println("Enter Channel Number:");
			channel=scanner.nextInt();
			Remote.setChannel(channel);
			
			System.out.println("Press 1 or 0 to increase or Decrease Volume:");
			volume=scanner.nextInt();
			if(volume==1)
			{
				Remote.IncVolume();
			}
			else if(volume==0)
			{
				Remote.DecVolume();
			}
			
			
			System.out.println("The Television information:");
			System.out.println("State:"+Remote.getState());
			System.out.println("Channel:"+Remote.getChannel());
			System.out.println("Volume:"+Remote.getVolume());
					
		}
		Remote.setState("OFF");
		

	}

}
