package creational.builderExamples.builderMessages.request.builders;

import creational.builderExamples.builderMessages.request.messages.Purchase;

public class PurchaseRequestBuilder implements Builder {

	private String field001;
	private String field002;
	private String field003;
	private String field004;
	private String field005;

	@Override
	public PurchaseRequestBuilder buildField001 (Object request3cIsoMsg, Object outputMsg) {
		this.field001 = "Field 1 from the PurchaseRequestBuilder has been populated";
		return this;
	}
	
	@Override
	public PurchaseRequestBuilder buildField002 (Object request3cIsoMsg, Object outputMsg) {
		this.field002 = "Field 2 from the PurchaseRequestBuilder has been populated";
		return this;
	}
	
	@Override
	public PurchaseRequestBuilder buildField003 (Object request3cIsoMsg, Object outputMsg) {
		this.field003 = "Field 3 from the PurchaseRequestBuilder has been populated";
		return this;
	}
	
	@Override
	public PurchaseRequestBuilder buildField004 (Object request3cIsoMsg, Object outputMsg) {
		this.field004 = "Field 4 from the PurchaseRequestBuilder has been populated";
		return this;
	}
	
	@Override
	public PurchaseRequestBuilder buildField005 (Object request3cIsoMsg, Object outputMsg) {
		this.field005 = "Field 5 from the PurchaseRequestBuilder has been populated";
		return this;
	}

	public Purchase build(){
		return new Purchase(field001, field002, field003, field004, field005);
	}
}
