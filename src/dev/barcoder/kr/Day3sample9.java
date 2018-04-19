package dev.barcoder.kr;

public class Day3sample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문에서 사용하는 변수는 하나의 단위다. for문이 몇번 실행되는지 하게해주는거
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
