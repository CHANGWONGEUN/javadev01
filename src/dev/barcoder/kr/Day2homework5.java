package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��Ͻʽÿ�"));
		b = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��Ͻʽÿ�"));
		
		if (a==b)
		{
			System.out.println("�� ���ڴ� �����ϴ�");
		}else if(a < b)
		{
			System.out.println(a+"����"+b+"(��)�� �� Ů�ϴ�");
		}else if(a > b)
		{
			System.out.println(b+"����"+a+"(��)�� �� Ů�ϴ�");
		};
	}

}
