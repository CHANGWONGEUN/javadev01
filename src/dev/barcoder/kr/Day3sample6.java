package dev.barcoder.kr;

public class Day3sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문의 중첩. 이 원리 잘 이해하기. for문의 특징을 중점으로.
		int i,j;
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
