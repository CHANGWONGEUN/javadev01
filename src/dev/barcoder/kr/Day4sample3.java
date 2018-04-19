package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		int sum=0;
		while (num!=0){
			num = Integer.parseInt(JOptionPane.showInputDialog(""));
			sum+=num;
		}
		System.out.println("시험점수의 합계는"+sum+"입니다");
	}

}
