package creational.builder.builderMessages.request.builders;

public class AuthorizationRequestBuilder implements Builder {
	@Override
	public AuthorizationRequestBuilder buildField001 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 1 from the AuthorizationRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public AuthorizationRequestBuilder buildField002 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 2 from the AuthorizationRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public AuthorizationRequestBuilder buildField003 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 3 from the AuthorizationRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public AuthorizationRequestBuilder buildField004 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 4 from the AuthorizationRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public AuthorizationRequestBuilder buildField005 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 5 from the AuthorizationRequestProcessor has been populated");
		return this;
	}
}
