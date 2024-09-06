package creational.builder;

import creational.builder.request.RequestProcessorFactory;

public class AuthorizationProcessor {
	private RequestProcessor requestProcessor;
	
	public String process(String messageType) throws Exception{
		this.requestProcessor = RequestProcessorFactory.getRequestProcessor(messageType);
		
	}
}
