package Library;
import java.util.HashMap;

public class Library {
	
	int itemID;	
	boolean found = false;
	
	HashMap<Integer, Item> fantasySection = new HashMap<Integer, Item>();
	HashMap<Integer, Item> scifiSection = new HashMap<Integer, Item>();
	
	public Library() {
		super();
	}
	
	public void addItem(Item item) {
		if (item.genre == "Fantasy") {
			fantasySection.put(itemID += item.ID + 1, item);
		}
		else if (item.genre == "Science Fiction") {
			scifiSection.put(itemID += item.ID + 1, item);
		} 
		
	}
	
	public void removeItem(Item item) {
		
		
	}
	
	public void updateItem(Item item) {
		
	}
}
