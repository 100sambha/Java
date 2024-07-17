package containment;

public class Author {
	private String authorName;
	private int age;
	private String place;

	public Author() {
		super();
	}
	
	public Author(String authorName, int age, String place) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getAge() {
		return age;
	}

	public String getPlace() {
		return place;
	}
}