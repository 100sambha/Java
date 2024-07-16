package constructors;

class CopyConstructor {
	private int x;
	private int y;

	public CopyConstructor(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public CopyConstructor(CopyConstructor other) {
		this.x = other.x;
		this.y = other.y;
	}

	public void display() {
		System.out.println("Point coordinates: (" + x + ", " + y + ")");
	}
}