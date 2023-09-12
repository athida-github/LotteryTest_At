package com.jdc.lottery;

public class Runner {
	
	public void run( int userNum, int amount){
		int lotteryNum = 889;

		int firstL= lotteryNum/100;
		int  secondL = (lotteryNum%100)/10;
		int  thirdL = lotteryNum%10;

		int firstU = userNum/100;
		int secondU = (userNum%100)/10;
		int thirdU = userNum%10;

		//System.out.println("Lottery first: " + firstL + " and Lottery Second :" + secondL + "   Third  : " + thirdL);
		//System.out.println("User first: " + firstU + " and User Second :" + secondU + "   Third  : " + thirdU);

		if(lotteryNum == userNum){
			System.out.println("Congratulations ! You win.... the Lottery number is : " + lotteryNum );
			System.out.println("Your Win amount : " + amount * 50);	
		}
		
		else if(
				(firstL == firstU || firstL == secondU || firstL == thirdU)
				&&(secondL == firstU || secondL == secondU || secondL == thirdU)
				&&(thirdL == firstU || thirdL == secondU || thirdL == thirdU)
				){
				System.out.println("You Win!.... the Lottery number is : " + lotteryNum );
				System.out.println("Your Win amount : " + amount * 10);	
				}

		else if(lotteryNum - 1 == userNum || lotteryNum + 1 == userNum){
			System.out.println("You Win!.... the Lottery number is : " + lotteryNum );
			System.out.println("Your Win amount : " + amount * 10);
		}
		else{
			System.out.println("Sorry ! you haven't win this time.");
		}	

	}

}

