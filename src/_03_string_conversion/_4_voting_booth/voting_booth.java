package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
	 public static void main(String[] args) {
		 String booth = JOptionPane.showInputDialog("How old are you?");
		 //if(booth > 18) {}
		 int boothAsInt = Integer.parseInt(booth);
		 if(boothAsInt>=18) {
			 JOptionPane.showInputDialog(null, "Who should the next president be? ");
			 
		 }else {
			 JOptionPane.showMessageDialog(null,"Nobody cares what you thinks!!!!!!!");
		 }
	 }
}
