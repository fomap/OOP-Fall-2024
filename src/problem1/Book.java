package problem1;

public class Book extends LibraryItem{

	private int numberOfPages;
	public Book(String title, String author, int publicationYear, int numberOfPages) {
		super(title, author, publicationYear);
		this.setNumberOfPages(numberOfPages);
		
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public String toString()
	{
		String res = "";
		res = String.format("Item is %s created by %s in %d. Book consists of %d number of pages", title, author, publicationYear, numberOfPages);		
		return res;
		
	}
	
	@Override
	public boolean equals(Object o) {
	   if (this == o) return true;
	   if (o == null || getClass() != o.getClass()) return false;
	   Book book = (Book) o;
	   return title.equals(book.title) && author.equals(book.author) && publicationYear == book.publicationYear && numberOfPages == book.numberOfPages;
	}

}
