package question04;

public class SystemMain04_02 {

	public static void main(String[] args) {
		int[]evenArray = new int[25];
		int[]oddArray = new int[25];
		
		int evenIndex = 0;
		int oddIndex = 0;
		
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
	
				evenArray[evenIndex] = i;
				evenIndex++;
			}else {
				oddArray[oddIndex] = i;
				oddIndex++;				
			}
		}
	
		
		
		for (int j = 1; j <= 25; j++) {
			if(j % 2 == 0) {
				System.out.println(j + "個目の要素:" + evenArray[j]);
			}
		}
		 
		
	}

}
