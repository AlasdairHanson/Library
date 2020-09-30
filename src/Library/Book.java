package Library;

public class Book extends Item{
	protected String title;
	protected String author;
	protected int pages;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.genre = "Unknown";
		this.pages = 0;
		this.itemType = "Unknown";
	}
	
	public Book(String title, String author, String genre, int pages, String itemType) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
		this.itemType = itemType;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}
	
	@Override
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String getGenre() {
		return this.genre;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPages() {
		return this.pages;
	}
	
	@Override
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	@Override
	public String getItemType() {
		return this.itemType;
	}
	
}
