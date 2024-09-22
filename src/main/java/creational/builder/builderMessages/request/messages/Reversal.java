package creational.builder.builderMessages.request.messages;

import creational.builder.builderMessages.request.builders.ReversalRequestBuilder;

public class Reversal implements RequestMessage{
	@Override
	public void parseMessage (Object Context, Object request3cIsoMsg, Object outputMsg) {
		ReversalRequestBuilder builder = new ReversalRequestBuilder();
		builder
				.buildField001(request3cIsoMsg, outputMsg)
				.buildField002(request3cIsoMsg, outputMsg)
				.buildField003(request3cIsoMsg, outputMsg)
				.buildField004(request3cIsoMsg, outputMsg)
				.buildField005(request3cIsoMsg, outputMsg);
	}
}
