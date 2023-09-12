package com.jdc.lottery;
import java.util.Scanner;

public class LotteryApp {
	
	public Scanner sc;
	public LotteryApp(){
		sc = new Scanner(System.in);
		
	}

	 
	public static void main(String [] args){
		System.out.println("=====================\r\n"+ "Welocme Lottery App\r\n"+ "=====================");
		System.out.println();
		var app = new LotteryApp();
		Runner calc = new Runner();
		//app.lotteryInput();
		int usrNum = app.getOut("Enter Lottery Number");
		
		int amount = app.getOut("Enter Amount");
		System.out.println();
		
		calc.run(usrNum, amount);
		
	}
		
	public String getIn(String num){
		System.out.println(num);
		return sc.nextLine();
	}
	

	public int getOut(String num){
		return Integer.parseInt(getIn(num));

	}
	

}
