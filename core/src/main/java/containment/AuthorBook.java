package containment;

public class AuthorBook {
	private String bookName;
	private double bookPrice;
	private Author author;
	
	public AuthorBook() {
		super();
	}
	
	public AuthorBook(String bookName, double bookPrice, Author author) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.author = author;
	}
	
	public void bookDetails() {
		System.out.println("Book Name :"+this.bookName+"\nBook Price :"+this.bookPrice+" \nAuthor Details"+"\nAuthor Details :"+this.author.getAuthorName()+"\nAuthor Age :"+this.author.getAge()+"\nPlace :"+this.author.getPlace());
	}	
}
