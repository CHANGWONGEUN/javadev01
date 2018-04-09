package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  sum, a, b, c, d, e;
		double ave;
		a = Integer.parseInt(JOptionPane.showInputDialog("과목1~5의 점수를 정수로 입력하십시오"));
		b = Integer.parseInt(JOptionPane.showInputDialog("과목1~5의 점수를 정수로 입력하십시오"));
		c = Integer.parseInt(JOptionPane.showInputDialog("과목1~5의 점수를 정수로 입력하십시오"));
		d = Integer.parseInt(JOptionPane.showInputDialog("과목1~5의 점수를 정수로 입력하십시오"));
		e = Integer.parseInt(JOptionPane.showInputDialog("과목1~5의 점수를 정수로 입력하십시오"));
		
		sum = 0;
		sum += a;
		sum += b;
		sum += c;
		sum += d;
		sum += e;
		
		ave = (double)sum / 5;
		
		System.out.println("5과목의 합계는"+sum+"점입니다.");
		System.out.println("5과목의 평균은"+ave+"점입니다.");
	}

}
