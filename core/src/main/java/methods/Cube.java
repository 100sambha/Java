package methods;

public class Cube {
	private int length;
	private int width;
	private int height;

	public Cube() {
		super();
	}
	
	public Cube(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public void CubeAreaFinder() {
		System.out.println("Area Of Cube :"+(this.length*this.width*this.height));
	}
	
	public static void main(String[] args) {
		Cube cube = new Cube(10, 12, 4);
		cube.CubeAreaFinder();
	}
}
