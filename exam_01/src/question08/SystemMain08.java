package question08;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SystemMain08 {

	public static void main(String[] args) {
		String phoneNumber = "12-3456-7890";
		int passportCode = 423534;
		Integer.toString(passportCode);
		
		Pattern p = Pattern.compile("[0-9]{2}-[0-9]{4}-[0-9]{4}");
		Matcher m = p.matcher(phoneNumber);
		
		if (m.find()) {
			System.out.println("パターンと一致しています");
		}else {
			System.out.println("正しい番号ではありません");
		}
		
		
		List<String>thingsToBuyList = new ArrayList<>();
		
		thingsToBuyList.add("牛乳");
		thingsToBuyList.add("卵");
		thingsToBuyList.add("パン");
		
		thingsToBuyList.remove(1);
		
		System.out.println(thingsToBuyList.get(1) + "が次に買うものです。");
	}

}
