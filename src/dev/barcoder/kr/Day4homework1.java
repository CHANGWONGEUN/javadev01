package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		i = Integer.parseInt(JOptionPane.showInputDialog("���ڸ� �Է��Ͻÿ�"));
		for(j=1;j<=i;j++){
			if(j%3==0){
				System.out.print("X"+" ");
			}else{
				System.out.print(j+" ");
			}
		}

	}

}
