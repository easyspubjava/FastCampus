package ch15;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("ลยน้ป๊ธฦ1");
		bookQueue.enQueue("ลยน้ป๊ธฦ2");
		bookQueue.enQueue("ลยน้ป๊ธฦ3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
