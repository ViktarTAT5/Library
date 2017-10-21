package by.htp.library.launch;

import by.htp.library.domen.Book;
import by.htp.library.domen.Library;
import by.htp.library.logic.Librarian;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		
		Librarian librarian = new Librarian(library);

		librarian.addBook(new Book("i", "I", 10, 1988));
		librarian.addBook(new Book("q", "Q", 12, 1989));
		librarian.addBook(new Book("z", "Z", 123, 2000));
		librarian.addBook(new Book("asd", "tyu", 500, 1995));
		librarian.addBook(new Book("i", "I", 10, 1988));

		librarian.showBooksLibrary();
		
		
		librarian.findAutor("I");
		

	}
}
