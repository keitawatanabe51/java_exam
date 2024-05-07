package question01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain01 {

	public static void main(String[] args)throws IOException {
		int applePrice;
		applePrice = 103;
		
		
		int bananaPrice;
		bananaPrice = 150;
		
		double tax = 1.08;
		double dSum;
		dSum = (applePrice + bananaPrice) * tax;
		
		System.out.println("リンゴとバナナの消費税込みの合計は" + dSum + "円です。");
		
		int iSum = (int)dSum;
				
		System.out.println("リンゴとバナナの消費税込みの合計は" + iSum + "円です。");
		
		
		System.out.println("消費者名を入力してください。");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String consumer = reader.readLine();
               
        System.out.println("消費者の名前は" + consumer + "です。");
		
		

	}

}
