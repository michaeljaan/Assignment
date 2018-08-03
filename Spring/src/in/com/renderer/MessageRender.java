package in.com.renderer;

import in.com.provider.MessageProvider;

public interface MessageRender {
	
	public void render();
	public void setMessageProvider(MessageProvider provider);

}
