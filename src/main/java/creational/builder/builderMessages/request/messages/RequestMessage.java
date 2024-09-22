package creational.builder.builderMessages.request.messages;

import jdk.jshell.spi.ExecutionControl;

public interface RequestMessage {
	public void parseMessage(Object Context, Object request3cIsoMsg, Object outputrequest3cIsoMsg) throws ExecutionControl.NotImplementedException;
}
