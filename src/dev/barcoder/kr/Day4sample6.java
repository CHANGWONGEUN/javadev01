package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4sample6 {
	
	public int getMax(int a, int b){
		
		int result=0; // ��������(�Լ� �ȿ� �ִ� ����)�� �ʱ�ȭ�� �ȵǾ� �־ ���� �ʱ�ȭ�� ������� ��!
		if(a>b){
			result = a;
		}else if(b>a){
			result = b;
		}
		return result; 
	}
    public int getMin(int a, int b){
		
		int result=0;
		if(a<b){
			result = a;
		}else if(b<a){
			result = b;
		}
		return result; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2; /*Max, Min;*/
		num1 = Integer.parseInt(JOptionPane.showInputDialog("���� 2���� �Է��ϼ���"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("���� 2���� �Է��ϼ���"));
		
		Day4sample6 obj = new Day4sample6();
		/*Max = obj.getMax(num1,num2);
		Min = obj.getMin(num1,num2);*/
		
		System.out.println(obj.getMin(num1, num2)+"�� ���� �۰�"+obj.getMax(num1, num2)+"�� ���� ũ��");

	}

}
