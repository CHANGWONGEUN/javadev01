package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하십시오"));
		
		if(a % 2 == 0)
		{
		    System.out.println(a+"(은)는 짝수입니다");
		}else if(a % 2 != 0)
		{
			System.out.println(a+"(은)는 홀수입니다");
		};
	}

}
