package chapter7.ex05.copy;

class Book {
	String title;
	String author;
	
	Book(){
		title = "책제목 없음";
		author = "작자미상";
	}
	
	Book(String title){
		this();
		this.title = title;
	}
	
	Book (String title, String author){
		this(title);
		this.author = author;
	}
	
	void print() {
		System.out.println("제목:" + title);
		System.out.println("책의 저자는:" + author);
	}
	
	
	
}








public class Book_Test {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.print();
		
		Book book2 = new Book("책책책");
		
		book2.print();

		Book book3 = new Book("책책책책책","홍길동");
		
		book3.print();

		
		
		
		
		
		
	}
	
	
}
