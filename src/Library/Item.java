package Library;

public abstract class Item {
	protected static int ID;
	protected String itemType;
	protected String genre;
	
	public abstract void setGenre(String genre);
	public abstract String getGenre();
	
	public abstract void setItemType(String item);
	public abstract String getItemType();
	
}
