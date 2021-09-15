
public class Book2 {
	String name;
	String author;
	
	public Book2() {
		this("","");
		System.out.println("생성자 호출");
	}
	public Book2(String a) {
		this(a, "작자미상");
	}
	public Book2(String a, String b) {
		this.name = a; this.author = b;
	}
	public void getInfo() {
		System.out.println("Book name : " + this.name);
		System.out.println("Author name : " + this.author);
		System.out.println("---------------------------");
	}

}
