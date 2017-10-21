package by.htp.library.logic;

import by.htp.library.domen.Book;
import by.htp.library.domen.Library;

public class Librarian {
	
	Library library;
	Library tempLibrary;
	
	public Librarian(Library library) {
		this.library = library;
	}

	public void addBook(Book book) {
		if (!findCopy(book)) {
			library.addBook(book);
			addBookMsg();
		} else {
			copyExistMsg(book);
		}
	}

	private boolean findCopy(Book book) {
		if (book != null && library != null) {
			for (int i = 0; i < library.getSize(); i++) {
				if (book.equals(library.getBook(i))) {
					return true;
				}
			}
		}
		return false;
	}

	public void findAutor(String autor) {
		findAutorInLibrary(autor);
		showBooks(tempLibrary);
	}

	private void findAutorInLibrary(String autor) {
		Library tempLibrary = new Library();
		String temp;
		if (autor != null) {
			for (int i = 0; i < library.getSize(); i++) {
				temp = library.getBook(i).getAutor();
				if (autor.equals(temp)) {
					tempLibrary.addBook(library.getBook(i));
				}
			}
		}
	}
	
	public void showBooksLibrary() {
		showBooks(library);
	}

	private static void showBooks(Library library) {
		System.out.println("    -----------------------------");
		for (int i = 0; i < library.getSize(); i++) {
			System.out.println(library.getBook(i).toString());
		}
		System.out.println("    -----------------------------");
	}

	private static void copyExistMsg(Book book) {
		System.out.println("The book " + book.toString() + " is already there");
	}

	private static void addBookMsg() {
		System.out.println("The book was added");
	}
	
	private static void delBookMsg() {
		System.out.println("The book was deleted");
	}
}
