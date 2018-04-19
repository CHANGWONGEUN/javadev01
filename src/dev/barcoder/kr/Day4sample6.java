package dev.barcoder.kr;

import javax.swing.JOptionPane;

public class Day4sample6 {
	
	public int getMax(int a, int b){
		
		int result=0; // 지역변수(함수 안에 있는 변수)는 초기화가 안되어 있어서 먼저 초기화를 시켜줘야 함!
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
		num1 = Integer.parseInt(JOptionPane.showInputDialog("정수 2개를 입력하세요"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("정수 2개를 입력하세요"));
		
		Day4sample6 obj = new Day4sample6();
		/*Max = obj.getMax(num1,num2);
		Min = obj.getMin(num1,num2);*/
		
		System.out.println(obj.getMin(num1, num2)+"이 가장 작고"+obj.getMax(num1, num2)+"이 가장 크다");

	}

}
