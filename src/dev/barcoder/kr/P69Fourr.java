package dev.barcoder.kr;

import java.io.*;

public class P69Fourr {
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("�������� ���� ���Դϱ�?");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		double num = Double.parseDouble(str);
		
		System.out.println("�������� ����"+str+"�Դϴ�");
		
	}

}
