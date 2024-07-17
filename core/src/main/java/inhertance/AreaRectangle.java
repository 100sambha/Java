package inhertance;

/**
 * @author sambhaji.pandhare
 *
 */
public class AreaRectangle extends AreaSquare {
	private int length;
	private int width;
	
	public AreaRectangle(int side, int length, int width) {
		super(side);
		this.length = length;
		this.width = width;
	}

	public void area() {
		System.out.println("Area of Rectangle :"+(this.length*this.width));
		super.area();
	}
}