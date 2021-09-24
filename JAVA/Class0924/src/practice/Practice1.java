package practice;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("divided : ");
			String a = sc.next();
			System.out.print("divider : ");
			String b = sc.next();
			
			if(a.equals("exit") || b.equals("exit")) {
				break;
			}
			
			Double a1 = Double.parseDouble(a);
			Double b1 = Double.parseDouble(b);
			
				try {
					System.out.println(a1 + " / " + b1 + " = " +(a1/b1));
				}
				catch(Exception e) {
					String error = e.getMessage();
					byte[] by = error.getBytes();
					Calendar now = Calendar.getInstance();
					
					FileOutputStream fo;
					try {
						fo = new FileOutputStream("/Users/sumin/Desktop/과제/log/"+
													now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH)+1) + "-" + now.get(Calendar.DAY_OF_MONTH) +
													"-" + now.get(Calendar.HOUR_OF_DAY) + "-" + now.get(Calendar.MINUTE) + "-" + now.get(Calendar.SECOND) + ".log");
						try {
							fo.write(by);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							fo.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
			}
			
		}
		
	}

}
