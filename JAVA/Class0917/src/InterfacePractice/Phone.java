package InterfacePractice;

public class Phone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("Driririririri~~~");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("Call from unknown!");
		
	}
	public void flash() {
		System.out.println("Flash from your phone");
	}
	

}
