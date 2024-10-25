package problem1;

public abstract class LibraryItem {
	protected String title;
	protected String author;
	protected int publicationYear;
	
	
	public LibraryItem(String title, String author, int publicationYear)
	{
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
		
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	
	public String toString()
	{
		String res = "";
		res = String.format("Item is %s created by %s in %d", title, author, publicationYear);		
		return res;
	}
	
	@Override
	public boolean equals(Object o) {
	   if (this == o) return true;
	   if (o == null || getClass() != o.getClass()) return false;
	   LibraryItem lb = (LibraryItem) o;
	   return title.equals(lb.title) && author.equals(lb.author) && publicationYear == lb.publicationYear;
	}
	
	
}

