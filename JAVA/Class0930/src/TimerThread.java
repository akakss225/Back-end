
public class TimerThread extends Thread {
	int n = 0;
	
	

	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			}
			catch(InterruptedException e){
				return;
			}
			if(n == 10) {
				break;
			}
			
		}
	}



	public static void main(String[] args) {
		
		TimerThread tt = new TimerThread();
		tt.run();

	}

}
