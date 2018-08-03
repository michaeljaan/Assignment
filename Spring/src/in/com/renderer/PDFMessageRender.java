package in.com.renderer;

import in.com.provider.MessageProvider;

public class PDFMessageRender implements MessageRender {

	private MessageProvider provider;
	@Override
	public void render() {
		System.out.println(provider.getMessage() + " on PDF:-)");
		
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider=provider;
		
	}

}
