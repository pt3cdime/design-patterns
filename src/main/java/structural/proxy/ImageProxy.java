package structural.proxy;

public class ImageProxy implements Image {
	/**
	 * Private Proxy data
	 */
	private String imageFilePath;

	/**
	 * Reference to RealSubject
	 */
	private Image proxifiedImage;

	public ImageProxy(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	
	
	@Override
	public void displayImage () {
	
	}
}
