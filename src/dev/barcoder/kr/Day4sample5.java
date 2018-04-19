package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min, num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("정수 2개를 입력하세요"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("정수 2개를 입력하세요"));
		
		if(num1>num2){
			max = num1;
			min = num2;
		}else{
			max = num2;
			min = num1;
		}
		System.out.println(min+"(이)가 가장 작고"+max+"(이)가 가장 큽니다");

	}

}
