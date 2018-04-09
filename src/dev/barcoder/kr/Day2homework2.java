package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B;
		double C;
		A = Integer.parseInt(JOptionPane.showInputDialog("삼각형의 밑변과 높이를 입력하십시오"));
		B = Integer.parseInt(JOptionPane.showInputDialog("삼각형의 밑변과 높이를 입력하십시오"));
		// 삼각형의 밑변과 높이를 입력하십시오. 를 하나만 띄우는 방법은?
		C = ((double)A*(double)B)/2 ;
		
		System.out.println("삼각형의 넓이는"+C+"입니다");
	}

}
