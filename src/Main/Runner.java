package Main;

import java.util.ArrayList;

import Library.Book;
import Library.Item;
import Library.Library;

public class Runner {
	public static void main(String[] args) {
		
		ArrayList<Item> items = new ArrayList();
		
		Book book1 = new Book("Harry Potter", "J.K.Rowling", "Fantasy", 450, "Book");
		Book book2 = new Book("Lord Of The Rings", "J.R.R Tolkien", "Fantasy", 500, "Book");
		Book book3 = new Book("1984", "Goerge Orwell", "Science Fiction", 235, "Book");
		
		items.add(book1);
		items.add(book2);
		
		Library library = new Library();
		library.addItem(book1);
		library.addItem(book2);
		library.addItem(book3);
		
	}

}
