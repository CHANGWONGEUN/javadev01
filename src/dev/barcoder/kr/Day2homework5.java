package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하십시오"));
		b = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하십시오"));
		
		if (a==b)
		{
			System.out.println("두 숫자는 같습니다");
		}else if(a < b)
		{
			System.out.println(a+"보다"+b+"(이)가 더 큽니다");
		}else if(a > b)
		{
			System.out.println(b+"보다"+a+"(이)가 더 큽니다");
		};
	}

}
