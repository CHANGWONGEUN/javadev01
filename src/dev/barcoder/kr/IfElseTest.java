package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dat;
		String inputData = JOptionPane.showInputDialog("���Է� :");
		//JOptionPane.showinputDialog("�޼���"). 
		dat=Integer.parseInt(inputData);
		//
		if(dat%10 == 0){
			System.out.println(dat+"(��)�� 10�� ��� �Դϴ�");
		}
		else{
			System.out.println(dat+"(dms)sms 10�� ����� �ƴմϴ�");
		}
	}
}
