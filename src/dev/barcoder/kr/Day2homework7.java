package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;
		c = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��Ͻʽÿ�"));
		
		switch(c)
		{
			case 1:
				System.out.println("����սô�");
				break;
			case 2:
				System.out.println("���� �� ����սô�");
				break;
			case 3:
				System.out.println("�� ���� ������ ��ǥ�� �սô�");
				break;
			case 4:
				System.out.println("�ſ� ���߽��ϴ�");
				break;
			case 5:
				System.out.println("�ſ� ����մϴ�");
				break;
		}
	}

}
