package creational.builderExamples.builderMessages;

import creational.builderExamples.builderMessages.request.DirectorFactory;
import creational.builderExamples.builderMessages.request.directors.Director;

public class AuthorizationProcessor {
	
	public String process(String messageType) throws Exception{
		Director director = DirectorFactory.getDirector(messageType);

		String message = director.buildMessage(new Object(), new Object()).log();

		return message;
	}
}
