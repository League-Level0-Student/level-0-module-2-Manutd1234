package _01_random._6_lottery_numbers;



import java.util.Random;

import javax.swing.JOptionPane;


public class lotterytickets {

public static void main(String[] args) {
	Random ran = new Random();
	
	int number = ran.nextInt(99-1+1)+1;
	int number1 = ran.nextInt(99-1+1)+1;
	int number2 = ran.nextInt(99-1+1)+1;
	int number3 = ran.nextInt(99-1+1)+1;
	int number4 = ran.nextInt(99-1+1)+1;
	int number5 = ran.nextInt(99-1+1)+1;
	String Content = number+" "+number1 +" "+number2+" "+number3+" "+number4+" "+number5;
	JOptionPane.showMessageDialog(null, Content);

	
	
}
}