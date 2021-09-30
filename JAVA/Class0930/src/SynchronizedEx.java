
public class SynchronizedEx {

	public static void main(String[] args) {
		// 칠판예제
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		th1.start();
		th2.start();
		
	}

}

class SharedBoard{
	private int sum = 0;
	synchronized public void add() { // synchronized(동기화)를 함으로써 충돌을 막는다.
		int n = sum;
		Thread.yield(); // 현재 실행중인 스레드 양보
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	public int getSum() {
		return sum;
	}
}
class StudentThread extends Thread{
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			board.add();
		}
	}
	
}