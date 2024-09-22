package creational.builderExamples.builderMessages.request.builders;

import creational.builderExamples.builderMessages.request.messages.Authorization;

public class AuthorizationRequestBuilder implements Builder {

	private String field001;
	private String field002;
	private String field003;
	private String field004;
	private String field005;

	@Override
	public AuthorizationRequestBuilder buildField001 (Object request3cIsoMsg, Object outputMsg) {
		this.field001 = "Field 1 from the AuthorizationRequestBuilder has been populated";
		return this;
	}
	
	@Override
	public AuthorizationRequestBuilder buildField002 (Object request3cIsoMsg, Object outputMsg) {
		this.field002 = "Field 2 from the AuthorizationRequestBuilder has been populated";
		return this;
	}
	
	@Override
	public AuthorizationRequestBuilder buildField003 (Object request3cIsoMsg, Object outputMsg) {
		this.field003 = "Field 3 from the AuthorizationRequestBuilder has been populated";
		return this;
	}
	
	@Override
	public AuthorizationRequestBuilder buildField004 (Object request3cIsoMsg, Object outputMsg) {
		this.field004 = "Field 4 from the AuthorizationRequestBuilder has been populated";
		return this;
	}
	
	@Override
	public AuthorizationRequestBuilder buildField005 (Object request3cIsoMsg, Object outputMsg) {
		this.field005 = "Field 5 from the AuthorizationRequestBuilder has been populated";
		return this;
	}

	public Authorization build(){
		return new Authorization(field001, field002, field003, field004, field005);
	}
}
