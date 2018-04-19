package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int sum=0;
		x = Integer.parseInt(JOptionPane.showInputDialog(" "));
		for( ;x>=1;x--)
		{
			if(x%2==0)
			{
				System.out.print(x+"+");
				sum+=x;
			}
		}System.out.print("="+sum);
	}

}
