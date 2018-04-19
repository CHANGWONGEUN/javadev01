package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day3sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog(""));
		b = Integer.parseInt(JOptionPane.showInputDialog(""));
		
		if(a>b)
		{
			System.out.println("1");
		}
		else if(b >= a)
		{
			System.out.println("0");
		}

	}

}
