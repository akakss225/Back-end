
public class Class10 {

	public static void main(String[] args) {
		
		Book2 littlePrince = new Book2("어린왕자", "생텍쥐페리");
		Book2 loveStory = new Book2("춘향전");
		Book2 emptyBook = new Book2();

		littlePrince.getInfo();
		loveStory.getInfo();
		emptyBook.getInfo();
	}

}
