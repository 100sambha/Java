package inhertance;

/**
 * @author sambhaji.pandhare
 *
 */
public class AreaSquare {
	private int side;
	
	public AreaSquare(int side) {
		super();
		this.side = side;
	}



	public void area() {
		System.out.println("Area Of Square :"+(this.side * this.side));
	}
}