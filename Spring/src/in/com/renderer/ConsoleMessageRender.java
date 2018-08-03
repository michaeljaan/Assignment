package in.com.renderer;

import in.com.provider.MessageProvider;

public class ConsoleMessageRender implements MessageRender {
	
	private MessageProvider provider;

	@Override
	public void render() {
		System.out.println(provider.getMessage()+ " on Console:-)");
		
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider=provider;
		
	}

}
