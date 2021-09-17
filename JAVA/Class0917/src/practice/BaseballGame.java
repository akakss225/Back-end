package practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class BaseballGame {	
	public ArrayList arr = new ArrayList();
	ArrayList answer;
	String end = "homerun";
	
	
	public BaseballGame() {
	}
	
	public int getNumber() {
		return (int)((Math.random()*9) + 1);
	}
	
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
	public void start() {
		this.setNumber();
		Scanner scan = new Scanner(System.in);
		String now = "initial";
		StringTokenizer st;
		while(!now.equals(this.end)) {
			System.out.print("Please write numbers(3) : ");
			String check = scan.next();
			st = new StringTokenizer(check, " ");
			
			while(st.hasMoreTokens()) {
				this.answer.add(st.nextToken());
			}
			for (int i = 0; i < this.answer.size(); i++) {
				
					
				}
			}
		}
	}
	
