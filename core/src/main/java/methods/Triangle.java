package methods;

public class Triangle {
	private int side1;
	private int side2;
	private int side3;
	
	private int angle1;
	private int angle2;
	private int angle3;

	public Triangle() {
		super();
	}

	public Triangle(int side1, int side2, int side3, int angle1, int angle2, int angle3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.angle1 = angle1;
		this.angle2 = angle2;
		this.angle3 = angle3;
	}

	public void trianglePerimeter() {		
		System.out.println("Perimeter of triangle is "+(this.side1+this.side2+this.side3));
	}
	
	public void triangleArea() {
		int semiPerimeter = (this.side1+this.side2+this.side3)/2;
		double area = Math.sqrt(semiPerimeter*(semiPerimeter-this.side1)*(semiPerimeter-side2)*(semiPerimeter-this.side3));
		System.out.println("Area of triangle is "+area);
	}
	
	public void isosceles() {
		if((this.angle1==this.angle2)||(this.angle1==this.angle3)||(this.angle2==this.angle3)) {
			System.out.println("Isosceles Trianle");
		}else {
			System.out.println("Not Isosceles Trianle");
		}
	}
	
	public void equilateral() {
		if((this.angle1==this.angle2)&&(this.angle1==this.angle3)) {
			System.out.println("Equilatral Triangle");
		}else {
			System.out.println("Not Equilatral Triangle");			
		}
	}
	
	public void rightAngled() {
		if((this.angle1==90)||(this.angle2==90)||(this.angle3==90)) {
			System.out.println("RightAngle Triangle");
		}else {
			System.out.println("Not RightAngle Triangle");			
		}
	}
}