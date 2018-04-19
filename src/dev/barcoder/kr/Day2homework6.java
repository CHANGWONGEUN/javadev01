package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;
		c = Integer.parseInt(JOptionPane.showInputDialog("0에서 10까지의 수를 입력하십시오"));
		
		if(0 <= c && c <=10)
		{
			System.out.println("정답입니다");
		}else
		{
			System.out.println("오답입니다");
		}
	}

}
