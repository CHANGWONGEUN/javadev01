package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4sample1 {
	/*public   void    sum     (int a,    int b)
	 <����������> <����Ÿ��> <�Լ��̸�> <�Ű�����1>  <�Ű�����2> */
	
	public static void sum(int a, int b){
		
		System.out.println("����"+(a+b)+"�Դϴ�");
	}
	
	public static void minus(int a, int b){
		
		System.out.println("�μ��� ����"+(a-b)+"�Դϴ�");
	}
	
public static void multi(int a, int b){
		
		System.out.println("�μ��� ����"+(a*b)+"�Դϴ�");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("��2"));
	    sum(num1,num2);
	    minus(num1,num2);
	    multi(num1,num2);

	}

}
