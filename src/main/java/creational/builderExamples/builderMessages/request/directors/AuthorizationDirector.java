package creational.builderExamples.builderMessages.request.directors;

import creational.builderExamples.builderMessages.request.builders.AuthorizationRequestBuilder;
import creational.builderExamples.builderMessages.request.messages.Message;

public class AuthorizationDirector implements Director {

    @Override
    public Message buildMessage(Object request3cIsoMsg, Object outputMsg) {
        return new AuthorizationRequestBuilder()
                .buildField001(request3cIsoMsg, outputMsg)
                .buildField002(request3cIsoMsg, outputMsg)
                .buildField003(request3cIsoMsg, outputMsg)
                .buildField004(request3cIsoMsg, outputMsg)
                .buildField005(request3cIsoMsg, outputMsg)
                .build();
    }
}
