package practice;

import java.util.Scanner;

class Play extends BaseballGame {
	public boolean state;
	
	public Play() {
		System.out.println("Are you want to play 'BASEBALL GAME'?");
		System.out.println("If you want to play this game, then please write 'Yes'");
		System.out.println("Or, If you don't want to play this game, then please write 'No'");
		System.out.print("state : ");
		Scanner sc = new Scanner(System.in);
		
		String check = sc.next();
		if(check.equals("Yes")) {
			this.state = true;
			System.out.println("Let's Go~ XO");
			
		}
		else if (check.equals("No")) {
			this.state = false;
			System.out.println("Ok.. See you next time :)");
		}
		else {
			System.out.println("Wrong command. Please write 'Yes' or 'No' :|");
			new Play();
		}
		sc.close();
		
	}

	
}
