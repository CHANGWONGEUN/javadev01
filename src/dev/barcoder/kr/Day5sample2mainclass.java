package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day5sample2mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5sample1sungjuk rec = new Day5sample1sungjuk();
		Day5sample1sungjuk rec2 = new Day5sample1sungjuk();
		
		rec.Std_num = JOptionPane.showInputDialog("�й�");
		rec.Std_name = JOptionPane.showInputDialog("�̸�");
		rec.kor = Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec.eng = Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec.mat = Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		System.out.println(rec.Std_num+rec.Std_name+"�� �����Դϴ�");
		
		rec.Sum();
		rec.Ave();

	}

}
