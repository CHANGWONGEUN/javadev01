package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, nn, i, j=0;
		n = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하시오"));
		for(i=1;i<=n;i++){
			nn = Integer.parseInt(JOptionPane.showInputDialog(""));
			if(nn%2==0){
				j++;
			}
		}System.out.println(j);
	}
}
