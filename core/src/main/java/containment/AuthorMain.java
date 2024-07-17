package containment;

public class AuthorMain {
	public static void main(String[] args) {
		Author author = new Author("Sarkar Raj", 26, "Nagar");
		AuthorBook authorBook = new AuthorBook("FinalDestination", 199, author);
		authorBook.bookDetails();
	}
}
