package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day3sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c ;
		a = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��Ͻʽÿ�"));
		b = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��Ͻʽÿ�"));
		c = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��Ͻʽÿ�"));
		
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
