package methods;

import java.util.Scanner;

public class RoomMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("************************Room Area, Clean and Paint Cost Finder************************");
		System.out.println("Enter Length Of Room");
		double length = scanner.nextDouble();
		System.out.println("Enter Width Of Room");
		double width = scanner.nextDouble();
		System.out.println("Enter Height Of Room");
		double height = scanner.nextDouble();
		Room room = new Room(length, width, height);
		
		scanner.close();
		
		System.out.println("Area Of White Washing Area is "+room.whiteWashingArea());
		System.out.println("White Washing Cost Of Room : "+room.whiteWashingCost());
		System.out.println("Flooring Cost Of Room : "+room.flooringCost());
	}

}
