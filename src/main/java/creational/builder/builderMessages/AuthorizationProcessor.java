package creational.builder.builderMessages;

import creational.builder.builderMessages.request.MessageFactory;
import creational.builder.builderMessages.request.messages.RequestMessage;

public class AuthorizationProcessor {
	private RequestMessage requestProcessor;
	
	public String process(String messageType) throws Exception{
		this.requestProcessor = MessageFactory.getRequestMessage(messageType);
		
		requestProcessor.parseMessage(new Object(), new Object(), new Object());
		
		return "";
	}
}
