package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  sum, a, b, c, d, e;
		double ave;
		a = Integer.parseInt(JOptionPane.showInputDialog("����1~5�� ������ ������ �Է��Ͻʽÿ�"));
		b = Integer.parseInt(JOptionPane.showInputDialog("����1~5�� ������ ������ �Է��Ͻʽÿ�"));
		c = Integer.parseInt(JOptionPane.showInputDialog("����1~5�� ������ ������ �Է��Ͻʽÿ�"));
		d = Integer.parseInt(JOptionPane.showInputDialog("����1~5�� ������ ������ �Է��Ͻʽÿ�"));
		e = Integer.parseInt(JOptionPane.showInputDialog("����1~5�� ������ ������ �Է��Ͻʽÿ�"));
		
		sum = 0;
		sum += a;
		sum += b;
		sum += c;
		sum += d;
		sum += e;
		
		ave = (double)sum / 5;
		
		System.out.println("5������ �հ��"+sum+"���Դϴ�.");
		System.out.println("5������ �����"+ave+"���Դϴ�.");
	}

}
