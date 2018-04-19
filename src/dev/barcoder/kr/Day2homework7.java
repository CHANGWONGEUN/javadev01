package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day2homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;
		c = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하십시오"));
		
		switch(c)
		{
			case 1:
				System.out.println("노력합시다");
				break;
			case 2:
				System.out.println("조금 더 노력합시다");
				break;
			case 3:
				System.out.println("더 높은 점수를 목표로 합시다");
				break;
			case 4:
				System.out.println("매우 잘했습니다");
				break;
			case 5:
				System.out.println("매우 우수합니다");
				break;
		}
	}

}
