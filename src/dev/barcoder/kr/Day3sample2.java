package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day3sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog(""));
		b = Integer.parseInt(JOptionPane.showInputDialog(""));
		
		if(a==1||b==1)
		{
			System.out.println("true");
		}
		else
		{
		    System.out.println("false");	
		}
	}

}
