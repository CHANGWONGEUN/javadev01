package dev.barcoder.kr;

public class Day5sample1sungjuk {
		public String Std_num;
		public String Std_name;
		public int kor, eng, mat;
		public int Sum(){
			System.out.println("합계는"+(kor+eng+mat)+"입니다");
			return kor + eng + mat;
		}
		
		public void Ave(){
			System.out.println("평균은"+(Sum()/3)+"입니다");
		}

}


