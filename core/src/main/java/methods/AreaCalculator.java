package methods;

public class AreaCalculator {

	public static void main(String[] args) {
		
		System.out.println("Method Overloading Code Example\n");
		
		Area area = new Area();
		
		System.out.println("Area OF Square "+area.area(4));
		System.out.println("Area Of Reactangle "+area.area(2, 5));
		System.out.println("Area Of Triangle "+area.area(4, 2, 5));
	}

}
