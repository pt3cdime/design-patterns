package creational.builder.builderMessages.request.builders;

public class ReversalRequestBuilder implements Builder {
	@Override
	public ReversalRequestBuilder buildField001 (Object request3cIsoMsg, Object outputMsg) {
		//Logic for setting field
		System.out.println("Field 1 from the ReversalRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public ReversalRequestBuilder buildField002 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 2 from the ReversalRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public ReversalRequestBuilder buildField003 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 3 from the ReversalRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public ReversalRequestBuilder buildField004 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 4 from the ReversalRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public ReversalRequestBuilder buildField005 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 5 from the ReversalRequestProcessor has been populated");
		return this;
	}
}
