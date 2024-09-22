package creational.builder.builderMessages.request.messages;

import creational.builder.builderMessages.request.builders.AuthorizationRequestBuilder;

public class Authorization implements RequestMessage{
	@Override
	public void parseMessage (Object Context, Object request3cIsoMsg, Object outputMsg) {
		AuthorizationRequestBuilder builder = new AuthorizationRequestBuilder();
		builder.buildField001(request3cIsoMsg, outputMsg)
				.buildField002(request3cIsoMsg, outputMsg)
				.buildField003(request3cIsoMsg, outputMsg)
				.buildField004(request3cIsoMsg, outputMsg)
				.buildField005(request3cIsoMsg, outputMsg);
	}
}