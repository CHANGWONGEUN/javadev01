package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min, num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("���� 2���� �Է��ϼ���"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("���� 2���� �Է��ϼ���"));
		
		if(num1>num2){
			max = num1;
			min = num2;
		}else{
			max = num2;
			min = num1;
		}
		System.out.println(min+"(��)�� ���� �۰�"+max+"(��)�� ���� Ů�ϴ�");

	}

}
