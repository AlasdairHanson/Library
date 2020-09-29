package Library;

public class Nonfiction extends Book {
	
	public Nonfiction() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.pages = 0;
		this.type = "Unknown";
	}
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String getTitle() {
		return this.title;
	}
	@Override
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String getAuthor() {
		return this.author;
	}
	@Override
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public int getPages() {
		return this.pages;
	}	
	@Override
	public void setType(String type) {
		this.type = type;
	}	
	@Override
	public String getType() {
		return this.type;
	}

}
