
class Weapon{
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon{
	protected int fire() {
		return 10;
	}
}

public class Class3 {

	public static void main(String[] args) {
		
		Weapon c = new Cannon();
		
		System.out.println(c.fire());

	}

}
