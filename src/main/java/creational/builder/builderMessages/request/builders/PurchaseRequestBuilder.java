package creational.builder.builderMessages.request.builders;

import jdk.jshell.spi.ExecutionControl;

public class PurchaseRequestBuilder implements Builder {
	@Override
	public PurchaseRequestBuilder buildField001 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 1 from the PurchaseRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public PurchaseRequestBuilder buildField002 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 2 from the PurchaseRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public PurchaseRequestBuilder buildField003 (Object request3cIsoMsg, Object outputMsg) throws ExecutionControl.NotImplementedException {
		throw new ExecutionControl.NotImplementedException("Purchases dont map field3");
	}
	
	@Override
	public PurchaseRequestBuilder buildField004 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 4 from the PurchaseRequestProcessor has been populated");
		return this;
	}
	
	@Override
	public PurchaseRequestBuilder buildField005 (Object request3cIsoMsg, Object outputMsg) {
		System.out.println("Field 5 from the PurchaseRequestProcessor has been populated");
		return this;
	}
}
