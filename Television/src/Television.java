
public class Television 
{
	private String state;
	private int channel;
	private int volume;
	
	
	
	public Television(String state, int channel, int volume) {
		super();
		this.state = state;
		this.channel = channel;
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}
	
	public void IncVolume()
	{
		this.volume+=1;
	}
	
	public void DecVolume()
	{
		this.volume-=1;
	}

	public String getState() {
		return state;
	}

	public void setState(String state)
	{
		this.state=state;
	}
	
}
