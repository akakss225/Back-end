class MyThread extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {			
			System.out.println(i);
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {return;}
		}
	}
	
}
class MyThread2 extends Thread{

	@Override
	public void run() {
		for(int i = 1000; i < 2000; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {return;}
		}
	}
	
}

public class ThreadSample {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		MyThread2 mt2 = new MyThread2();
		mt2.start();
	}

}
