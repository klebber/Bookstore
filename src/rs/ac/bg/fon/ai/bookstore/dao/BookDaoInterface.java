package rs.ac.bg.fon.ai.bookstore.dao;

import java.util.List;

import rs.ac.bg.fon.ai.bookstore.model.Author;
import rs.ac.bg.fon.ai.bookstore.model.Book;
import rs.ac.bg.fon.ai.bookstore.model.Genre;

public interface BookDaoInterface {
	
	public void addBook(Book book) throws RuntimeException;
	public void removeBook(String isbn) throws RuntimeException;
	public void removeBooks(String name);
	public List<Book> getAllBooks();
	public List<Book> getBooks(char c);
	public List<Book> getBooks(Genre genre);
	public List<Book> getBooks(Author author);

}