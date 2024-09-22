package creational.builderExamples.builderMessages.request.directors;

import creational.builderExamples.builderMessages.request.messages.Message;

public interface Director {
    public Message buildMessage(Object request3cIsoMsg, Object outputMsg);
}
