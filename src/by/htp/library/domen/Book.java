package by.htp.library.domen;

public class Book {

	private String title = "Book";
	private String autor = "Unknown";
	private int page = 1;
	private int year;

	public Book() {

	}

	public Book(String title, String autor, int page, int year) {
		this.title = title;
		this.autor = autor;
		this.page = page;
		this.year = year;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		Book other = (Book) obj;
//		if (title == null) {
//			if (other.title != null) {
//				return false;
//			}
//		} else {
//			if(!title.equals(other.title)) {
//				return false; 
//			}
//		}
//		if(autor == null) {
//			if(other.autor != null) {
//				return false;
//			}
//		} else {
//			if(!autor.equals(other.autor)) {
//				return false;
//			}
//		}
//		if(page != other.page) {
//			return false;
//		}
//		if(year != other.year) {
//			return false;
//		}
//
//		return true;
//	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + page;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (page != other.page)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Title: " + title + "; Autor: " + autor + "; Page: " + page + "; Year: " + year + ";]";
	}

}
