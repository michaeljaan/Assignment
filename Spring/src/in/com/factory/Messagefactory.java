package in.com.factory;

import java.util.ResourceBundle;

import in.com.provider.MessageProvider;
import in.com.renderer.MessageRender;

public class Messagefactory {
	
	
	public static MessageRender getMessageRender() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	ResourceBundle bundle =ResourceBundle.getBundle("context");
	
	String providerstr= bundle.getString("provider");
	MessageProvider provider= (MessageProvider) Class.forName(providerstr).newInstance();
	
	String renderstr= bundle.getString("render");
	MessageRender render= (MessageRender) Class.forName(renderstr).newInstance();
	
	render.setMessageProvider(provider);
	
	return render;
}
}
