package creational.builderExamples.classicBuilder;

public class House {
	private int doors;
	private String color;
	private int size;
	private int windows;
	
	private House (Builder builder) {
		this.doors = builder.doors;
		this.color = builder.color;
		this.size = builder.size;
		this.windows = builder.windows;
	}
	
	public int getDoors () {
		return doors;
	}
	
	public String getColor () {
		return color;
	}
	
	public int getSize () {
		return size;
	}
	
	public int getWindows () {
		return windows;
	}
	
	public String toString(){
		return "Doors: " + this.doors +
				"\nColor: " + this.color +
				"\nSize: " + this.size +
				"\nWindows: " + this.windows;
	}
	
	public static class Builder{
		private int doors;
		private String color;
		private int size;
		private int windows;
		
		public Builder doors (int doors) {
			this.doors = doors;
			return this;
		}
		
		public Builder color (String color) {
			this.color = color;
			return this;
		}
		
		public Builder size (int size) {
			this.size = size;
			return this;
		}
		
		public Builder windows (int windows) {
			this.windows = windows;
			return this;
		}
		
		public House build(){
			return new House(this);
		}
	}
}
