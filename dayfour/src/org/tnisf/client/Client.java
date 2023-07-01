package org.tnisf.client;
import orh.tnsif.servicelayer.BookService;
import orh.tnsif.servicelayer.BookServiceImplementation;
public class Client {

	public static void main(String[] args) {
		BookService service = new BookServiceImplementation();
		
		System.out.println("Book with Specific ID: ");
		System.out.println(service.getBookByID(0));
		
		System.out.println("Book with Specific Author: ");
		System.out.println(service.getAuthorBooks("Dennis Richie"));

		System.out.println("Book with Specific title: ");
		System.out.println(service.getAuthorBooks("AI"));

		System.out.println("Book Count: ");
		System.out.println(service.getBookCount());

		System.out.println("Book with Specific ID: ");
		System.out.println(service.getBookByID(0));


	}

}
