package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain03 {

	public static void main(String[] args) throws IOException{
		int youngestAge = 20;
		
		System.out.println("年齢を入力してください。");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int userAgeInput = Integer.parseInt(str);
		
		
		
		if(userAgeInput < youngestAge) {
			System.out.println("未成年なので、お酒の提供ができません。");
		}else {
			System.out.println("お酒の提供が可能です。");
		}
		
		
		do {
			System.out.println("年齢を入力してください。");
			String str2 = reader.readLine();
			int userAgeInput2 = Integer.parseInt(str2);
			System.out.println("未成年なので、お酒の提供ができません。");
			}while(userAgeInput2 > youngestAge);
			System.out.println("お酒の提供が可能です。");
			
		
		
		System.out.println("曜日を日本語で入力してください。");
		String userDayInput = reader.readLine();
		switch(userDayInput) {
				case "月曜日":
					System.out.println("Monday");
					break;
				case "火曜日":
					System.out.println("Tuesday");
					break;
				case "水曜日":
					System.out.println("Wednesay");
					break;
				case "木曜日":
					System.out.println("Thursday");
					break;
				case "金曜日":
					System.out.println("Friday");
					break;
				case "土曜日":
					System.out.println("Saturday");
					break;
				case "日曜日":
					System.out.println("Sunday");
					break;	
		}
		
		String [] studentName = new String[5];
		studentName[0] = "かなこ";
		studentName[1] = "ゆうた";
		studentName[2] = "あい";
		studentName[3] = "はるひ";
		studentName[4] = "かずき";
		
		for(int i = 0; i<=4;i++) {
			System.out.println((i + 1)+ "番目の生徒の名前は" + studentName[i] + "さんです");
			
		}
		
		for(String name : studentName) {
			System.out.println(name);
		}
		
		
				
		
		
		
	}

}
