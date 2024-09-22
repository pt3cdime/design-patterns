package creational.builderExamples.builderMessages.request;

import creational.builderExamples.builderMessages.request.directors.AuthorizationDirector;
import creational.builderExamples.builderMessages.request.directors.Director;
import creational.builderExamples.builderMessages.request.directors.PurchaseDirector;
import creational.builderExamples.builderMessages.request.directors.ReversalDirector;

public class DirectorFactory {
	
	public static Director getDirector(String messageType) throws Exception {
		return switch (messageType) {
			case "2100" -> new AuthorizationDirector();
			case "2200" -> new PurchaseDirector();
			case "2420" -> new ReversalDirector();
			default -> throw new Exception("Message type not supported");
		};
	}
}
