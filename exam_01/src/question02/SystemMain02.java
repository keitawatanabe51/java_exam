package question02;

public class SystemMain02 {

	public static void main(String[] args) {
		
		int[]studentAgeGroup1 = new int[5];
			studentAgeGroup1[0] = 22;
			studentAgeGroup1[1] = 18; 
			studentAgeGroup1[2] = 24;
			studentAgeGroup1[3] = 19;
			studentAgeGroup1[4] = 20;
				
		
		
		
		System.out.println("配列studentAgeGroup1で2番目の人の年齢は" + studentAgeGroup1[1] + "です。");
	
		int[]studentAgeGroup2 = {23,33,26,21,25};
		
		
		System.out.println("配列studentAgeGroup2で4番目の人の年齢は" + studentAgeGroup2[3] + "です。");
		
		int[][]studentGroup = {studentAgeGroup1,studentAgeGroup2};
		
		System.out.println("私の年齢は" + studentGroup[1][2] + "歳です。");
	
	}

}