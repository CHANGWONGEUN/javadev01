package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day5sample2mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5sample1sungjuk rec = new Day5sample1sungjuk();
		Day5sample1sungjuk rec2 = new Day5sample1sungjuk();
		
		rec.Std_num = JOptionPane.showInputDialog("학번");
		rec.Std_name = JOptionPane.showInputDialog("이름");
		rec.kor = Integer.parseInt(JOptionPane.showInputDialog("국어"));
		rec.eng = Integer.parseInt(JOptionPane.showInputDialog("영어"));
		rec.mat = Integer.parseInt(JOptionPane.showInputDialog("수학"));
		
		System.out.println(rec.Std_num+rec.Std_name+"의 성적입니다");
		
		rec.Sum();
		rec.Ave();

	}

}
