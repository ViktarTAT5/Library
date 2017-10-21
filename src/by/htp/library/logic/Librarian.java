package by.htp.library.logic;

import by.htp.library.domen.Book;
import by.htp.library.domen.Library;

public class Librarian {

	Library library;
	Library tempLibrary;

	private static final String DEL_BOOKS_MSG = "The book was deleted ";
	private static final String ADD_BOOKS_MSG = "The book was added ";
	private static final String AUTOR_NULL = "No autor specified ";

	public Librarian(Library library) {
		this.library = library;
	}

	public void addBook(Book book) {
		if (!findCopy(book)) {
			library.addBook(book);
			print(ADD_BOOKS_MSG + book.toString());
		} else {
			copyExistMsg(book);
		}
	}

	public void delBook(String title) {
		if (title != null) {
			for (int i = 0; i < library.getSize(); i++) {
				if (title.equals(library.getBook(i).getTitle())) {
					String temp = library.getBook(i).toString();
					library.delBook(i);
					print(DEL_BOOKS_MSG + temp);
					return;
				}
			}
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
		print(AUTOR_NULL);
	}

	public static void sortingYear(Library library) {
		if (library != null) {
			for (int i = library.getSize() - 1; i >= 0; i--) {
				for (int j = 0; j < i; j++) {
					int yearOne = library.getBook(j).getYear();
					int yearTwo = library.getBook(j + 1).getYear();
					if (yearOne < yearTwo) {
						Book temp = library.setBook(j, library.getBook(j + 1));
						library.setBook(j + 1, temp);
					}
				}
			}
		}
	}

	public void showBooksLibrary() {
		showBooks(library);
	}

	private static void showBooks(Library library) {
		print("    -----------------------------");
		for (int i = 0; i < library.getSize(); i++) {
			print(library.getBook(i).toString());
		}
		print("    -----------------------------");
	}

	private static void copyExistMsg(Book book) {
		print("The book " + book.toString() + " is already there");
	}

	private static void print(String text) {
		System.out.println(text);
	}
}
