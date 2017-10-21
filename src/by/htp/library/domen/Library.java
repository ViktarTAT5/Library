package by.htp.library.domen;

import by.htp.library.logic.ArrayList;

public class Library {
	private	ArrayList<Book> books = new ArrayList();
	
//	public void set(ArrayList<Book> books) {
//		this.books = books;
//	}
//	
//	public ArrayList<Book> get(){
//		return books; 
//	}
	
	public int getSize() {
		return books.size();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book getBook(int index) {	
		return books.get(index);
	}
	
	public boolean delBook(int index) {
		if(books.remove(index) != null) {
			return true;
		}
		return false;
	}
	
	public boolean delBook(Book book) {
		return books.remove(book);
	}
}
