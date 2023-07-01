package orh.tnsif.servicelayer;

import java.util.List;

import org.tnsif.dao.BookDao;
import org.tnsif.dao.BookDaoImplementation;
import org.tnsif.entities.Book;

public class BookServiceImplementation implements BookService{

	private BookDao dao;
	
	
	public BookServiceImplementation() {
		dao = new BookDaoImplementation();
	}

	@Override
	public Book getBookByID(int id) {
		return dao.getBookByID(id);
		
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public List<Book> getBookByPrice(double low, double high) {
		return dao.getBookByPrice(low, high);
	}

}
