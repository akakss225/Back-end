package practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class BaseballGame {
	// 컴퓨터 랜덤숫자 만들 그릇.
	public ArrayList<Integer> arr = new ArrayList<Integer>();
	// 내가 입력해서 컴퓨터 숫자와 비교할 숫자 그릇.
	ArrayList<Integer> answer = new ArrayList<Integer>();
	// 맞췄을때 리턴할 값.
	String end = "homerun";
	int tried = 0;
	
	// 생성자 호출
	public BaseballGame() {
	}
	// 랜덤숫자 만들기
	public int getNumber() {
		return (int)((Math.random()*9) + 1);
	}
	// getNumber 을 이용해 3자리숫자 만들기.
	public ArrayList setNumber() {
		
		while(this.arr.size()  < 3){
			int num = this.getNumber();
			if (!arr.contains(num)) {
				arr.add(num);
			}
			else {
				num = this.getNumber();
			}
		}
		return this.arr;
	}
	
	
	// 게임 시작.
	public void start() {
		// 게임 시작 호출시, 랜덤숫자 만들기.
		this.setNumber();
		// 숫자 입력
		Scanner scan = new Scanner(System.in);
		String now = "initial";
		int strikeCount = 0;
		int ballCount = 0;
		System.out.println(arr);
		
		while(!now.equals(end)) {
			System.out.print("Please Write a numbers(3) : ");
			String check = scan.nextLine();
			StringTokenizer st = new StringTokenizer(check, " ");
			while(st.hasMoreTokens()) {
				answer.add(Integer.parseInt(st.nextToken()));
			}
			
			for(int i = 0; i < answer.size(); i++) {
				if(this.answer.get(i) == this.arr.get(i)) {
					strikeCount += 1;
				}
				else if(this.arr.contains(this.answer.get(i))) {
					ballCount += 1;
				}
			}
			
			if(ballCount == 0 && strikeCount == 0) {
				tried += 1;
				now = "OUT!";
				System.out.println(now);
				answer.clear();
				
			}
			else if(ballCount != 0 || strikeCount != 3) {
				tried += 1;
				now = strikeCount +  " strike " + ballCount + " ball ~ ";
				System.out.println(now);
				answer.clear();
				ballCount = 0;
				strikeCount = 0;
			}
			else if(strikeCount == 3) {
				tried += 1;
				now = end;
				System.out.println(now);
				answer.clear();
				ballCount = 0;
				strikeCount = 0;
			}
			
		}
		System.out.println("How many times You needed : " + tried);
		switch(tried) {
		case 1: System.out.println("WTF! You are Lucky guy!"); break;
		case 2: System.out.println("WTF! You are Lucky guy!"); break;
		case 3: System.out.println("ohh~~ You are a Genius"); break;
		case 4: System.out.println("ohh~~ You are a Genius"); break;
		case 5: System.out.println("ohh~~ You are a Genius"); break;
		case 6: System.out.println("You are a Good player!"); break;
		case 7: System.out.println("You are a Good player!"); break;
		case 8: System.out.println("You are a Good player!"); break;
		case 9: System.out.println("You are a Good player!"); break;
		case 10: System.out.println("You are a Good player!"); break;
		case 11: System.out.println("Nice play"); break;
		case 12: System.out.println("Nice play"); break;
		case 13: System.out.println("Nice play"); break;
		case 14: System.out.println("You need more effort"); break;
		case 15: System.out.println("You need more effort"); break;
		case 16: System.out.println("You need more effort"); break;
		case 17: System.out.println("You need more effort"); break;
		default : System.out.println("Bad plat kkkkkkk!!"); break;
		}
		
	}
}
	
