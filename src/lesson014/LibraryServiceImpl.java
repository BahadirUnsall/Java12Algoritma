package lesson014;

import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements ILibraryService {
	Scanner scanner = new Scanner(System.in);

	@Override
	public void createBook() {
		String bookName = Util.getStringValue("kitap ismini girin");
		String authorName = Util.getStringValue("yazar ismini girin");
		String publisher = Util.getStringValue("yayın evini girin");
		String categoryName = Util.getStringValue("Kategori girin");
		double price = Util.getDoubleValue("kitap ücreti");
		
		
		
		Category category =new Category(categoryName);

		
		Book book = new Book(bookName, authorName, publisher, price,category);

		Main.library.getBookList().add(book);
		System.out.println(bookName + " sisteme eklendi.");
	}

	@Override
	public void getAllBooks(List<Book> bookList) {
		System.out.println("Name\tAuthorName\tCategory\tPrice");
		for (Book book : bookList) {
			System.out.println(book.getBookName() + "\t" + book.getAuthorName() + "\t" + book.getCategory() + "\t"+  book.getPrice());

		}
	}

	@Override
	public void getAllBooksByActive() {
		System.out.println("Name\tAuthorName\tPrice");
		for (Book book : Main.library.getBookList()) {
			if (book.geteStatus().name().equals("ACTIVE")) {
				System.out.println(book.getBookName() + "\t" + book.getAuthorName() + "\t\t" + book.getCategory() + "\t"+   book.getPrice());
			}
		}
	}

	@Override
	public void getAuthorByName() {
		String name = Util.getStringValue("Yazar ismi girin");
		for (Book author : Main.library.getBookList()) {
			if (author.getAuthorName().equals(name)) {
				System.out.println(author.getBookName() + "\t" + author.getAuthorName() + "\t\t" + author.getCategory().getName() + "\t"+   author.getPrice());
			}
		}
	}

	@Override
	public void deleteBookByID() {
		String id = Util.getStringValue("id girin");
		Main.library.getBookList().forEach(product -> System.out.println(product.getId()));
		for (int i = 0; i < Main.library.getBookList().size(); i++) {
			if(Main.library.getBookList().get(i).getId().equals(id)) {
				System.out.println(Main.library.getBookList().get(i).getBookName() + " silindi.");
				Main.library.getBookList().remove(i);
				return;
			}
		}
		System.out.println("Böyle bir kitap bulunmuyor.");
	}

}
