package Library;

public abstract class Book {
	protected String title;
	protected String author;
	protected String type;
	protected int pages;
	
	public abstract void setTitle(String title);
	public abstract String getTitle();
	
	public abstract void setAuthor(String author);
	public abstract String getAuthor();
	
	public abstract void setPages(int pages);
	public abstract int getPages();
	
	public abstract void setType(String type);
	public abstract String getType();
	}
}
