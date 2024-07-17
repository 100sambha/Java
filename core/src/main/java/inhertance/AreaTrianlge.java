package inhertance;

/**
 * @author sambhaji.pandhare
 *
 */
public class AreaTrianlge extends AreaRectangle {
	private int side1;
	private int side2;
	private int side3;

	public AreaTrianlge(int side, int length, int width, int side1, int side2, int side3) {
		super(side, length, width);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void area() {
		double semiPerimeter = (side1+side2+side3)/2.0;
		double area = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
		System.out.println("Area Of Triangle :"+area);
		super.area();
	}
}