package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B;
		double C;
		A = Integer.parseInt(JOptionPane.showInputDialog("�ﰢ���� �غ��� ���̸� �Է��Ͻʽÿ�"));
		B = Integer.parseInt(JOptionPane.showInputDialog("�ﰢ���� �غ��� ���̸� �Է��Ͻʽÿ�"));
		// �ﰢ���� �غ��� ���̸� �Է��Ͻʽÿ�. �� �ϳ��� ���� �����?
		C = ((double)A*(double)B)/2 ;
		
		System.out.println("�ﰢ���� ���̴�"+C+"�Դϴ�");
	}

}
