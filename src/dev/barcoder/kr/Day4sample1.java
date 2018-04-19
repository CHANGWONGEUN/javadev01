package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4sample1 {
	/*public   void    sum     (int a,    int b)
	 <접근제한자> <리턴타입> <함수이름> <매개변수1>  <매개변수2> */
	
	public static void sum(int a, int b){
		
		System.out.println("합은"+(a+b)+"입니다");
	}
	
	public static void minus(int a, int b){
		
		System.out.println("두수의 차는"+(a-b)+"입니다");
	}
	
public static void multi(int a, int b){
		
		System.out.println("두수의 곱는"+(a*b)+"입니다");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));
	    sum(num1,num2);
	    minus(num1,num2);
	    multi(num1,num2);

	}

}
