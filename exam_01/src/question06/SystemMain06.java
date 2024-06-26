package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain06 {

	public static void main(String[] args) throws IOException {
		
		String phoneNumber;
		int fee;
		double internetSpeed;
		
		
		//SmartPhone06オブジェクトを生成
		SmartPhone06 phoneA = new SmartPhone06();
		
		System.out.println("電話番号を入力してください。");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		phoneNumber = reader.readLine();
		
		System.out.println("料金を入力してください。");
		String str = reader.readLine();
		 fee = Integer.parseInt(str);
		
		//phoneNumber,feeをphoneAのフィールドに格納
		phoneA.setPhoneNumber(phoneNumber);
		phoneA.setFee(fee);
		
		System.out.println("通信速度を入力してください。");
		
		String str2 = reader.readLine();
		internetSpeed = Double.parseDouble(str2);
		
		//phoneAのフィールドに格納
		phoneA.setInternetSpeed(internetSpeed);
		
		//phoneBのオブジェクトを生成
		SmartPhone06 phoneB = new SmartPhone06();
		
		phoneA.showInfo();
		phoneB.showInfo();
		
		
		
		if (phoneA.equals(phoneB)) {
			System.out.println("同じオブジェクトを参照しています。");
		}else {
			System.out.println("違うオブジェクトです。");
		}
	}
	
}
