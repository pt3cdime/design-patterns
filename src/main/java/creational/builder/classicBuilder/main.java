package creational.builder.classicBuilder;

public class main {
	public static void main(String[] args){
		House house1 = new House.Builder()
				.color("white")
				.size(10)
				.windows(2)
				.doors(2)
				.build();
		System.out.println(house1.toString());
	}
}
