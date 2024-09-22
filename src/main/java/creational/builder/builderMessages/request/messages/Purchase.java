package creational.builder.builderMessages.request.messages;

import creational.builder.builderMessages.request.builders.PurchaseRequestBuilder;
import creational.builder.builderMessages.request.builders.ReversalRequestBuilder;
import jdk.jshell.spi.ExecutionControl;

public class Purchase implements RequestMessage{
	@Override
	public void parseMessage (Object Context, Object request3cIsoMsg, Object outputMsg) throws ExecutionControl.NotImplementedException {
		PurchaseRequestBuilder builder = new PurchaseRequestBuilder();
		builder
				.buildField001(request3cIsoMsg, outputMsg)
				.buildField002(request3cIsoMsg, outputMsg)
				.buildField004(request3cIsoMsg, outputMsg)
				.buildField005(request3cIsoMsg, outputMsg);
	}
}
