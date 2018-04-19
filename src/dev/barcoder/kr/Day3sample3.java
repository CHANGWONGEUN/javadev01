package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day3sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c ;
		a = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하십시오"));
		b = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하십시오"));
		c = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하십시오"));
		
		if(a % 2 == 0)
		{
			System.out.println(a);
		}
		if (b % 2 == 0)
		{
			System.out.println(b);
		}
		if(c % 2 == 0)
		{
			System.out.println(c);
		}
	}

}
