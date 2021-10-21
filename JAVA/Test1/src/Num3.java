
class Member {
	String name;
	String address;
	void person() {
		System.out.println(name + ", " + address);
	}
}

public class Num3 {

	public static void main(String[] args) {
		Member p = new Member();
		p.name = "송수민";
		p.address = "인천";
		p.person();

	}

}
