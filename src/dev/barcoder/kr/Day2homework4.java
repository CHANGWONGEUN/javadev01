package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��Ͻʽÿ�"));
		
		if(a % 2 == 0)
		{
		    System.out.println(a+"(��)�� ¦���Դϴ�");
		}else if(a % 2 != 0)
		{
			System.out.println(a+"(��)�� Ȧ���Դϴ�");
		};
	}

}
