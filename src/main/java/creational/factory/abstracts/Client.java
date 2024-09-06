package creational.factory.abstracts;

public class Client {
	public static void main(String args[]) {
		AbstractFactory pf = FactoryMaker.getFactory("a");
		AbstractProductB product = pf.createProductB();
		// more function calls on product
	}
}
