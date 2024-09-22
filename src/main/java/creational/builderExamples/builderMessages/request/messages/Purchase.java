package creational.builderExamples.builderMessages.request.messages;

public class Purchase implements Message{
	private String field001;
	private String field002;
	private String field003;
	private String field004;
	private String field005;

	public Purchase(String field001, String field002, String field003, String field004, String field005) {
		this.field001 = field001;
		this.field002 = field002;
		this.field003 = field003;
		this.field004 = field004;
		this.field005 = field005;
	}

	@Override
	public String log() {
		return field001 + "\n" + field002 + "\n" + field003 + "\n" + field004 + "\n" + field005;
	}
}
