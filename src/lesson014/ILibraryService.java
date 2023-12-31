package lesson014;

import java.util.List;

public interface ILibraryService {
	public void createBook();
	public void getAllBooks(List<Book> bookList);
	void getAllBooksByActive();
	void getAuthorByName();
	void deleteBookByID();
	void changeStatusToDeleted(String id);
	void applyDiscount(String id, double discountPrice);
}
