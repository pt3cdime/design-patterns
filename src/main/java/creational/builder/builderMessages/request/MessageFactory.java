package creational.builder.builderMessages.request;

import creational.builder.builderMessages.request.messages.Authorization;
import creational.builder.builderMessages.request.messages.Purchase;
import creational.builder.builderMessages.request.messages.RequestMessage;
import creational.builder.builderMessages.request.messages.Reversal;

public class MessageFactory {
	
	public static RequestMessage getRequestMessage(String messageType) throws Exception {
		return switch (messageType) {
			case "2100" -> new Authorization();
			case "2200" -> new Purchase();
			case "2420" -> new Reversal();
			default -> throw new Exception("Message type not supported");
		};
	}
}
