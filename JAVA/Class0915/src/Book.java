
public class Book {
	
	String name;
	String author;
	
	public Book() {
		
	}
	public Book(String a) {
		name = a; author = "작자미상";
	}
	public Book(String a, String b) {
		name = a; author = b;
	}
	public void getInfo() {
		System.out.println("Book name : " + name);
		System.out.println("Author name : " + author);
	}
	

	public static void main(String[] args) {

		Book littlePrince = new Book();
		littlePrince.author = "생텍쥐페리";
		littlePrince.name = "어린왕자";
		
		Book fantasy = new Book("전지적독자시점");
		
		Book muhyeop = new Book("화산권마", "송수민");
		
		littlePrince.getInfo();
		System.out.println("---------------------------");
		fantasy.getInfo();
		System.out.println("---------------------------");
		muhyeop.getInfo();

	}

}
