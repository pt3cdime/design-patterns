package creational.builder.request;

import creational.builder.AuthorizationProcessor;
import creational.builder.RequestProcessor;

public class RequestProcessorFactory {
	
	public static RequestProcessor getRequestProcessor(String messageType) throws Exception {
		switch (messageType){
			case "2100": return new AuthorizationRequestProcessor();
			case "2200": return new PurchaseRequestProcessor();
			case "2420": return new ReversalRequestProcessor();
			default: throw new Exception("Message type not supported");
		}
	}
}
