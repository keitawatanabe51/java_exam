package question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain05 {

	public static void main(String[] args) throws IOException {
		Student05 studentA = new Student05();
		
		System.out.println("studentA の名前を入力してください。");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader.readLine();
		
		studentA.getName = name;
						
		System.out.println("studentA の年齢を入力してください。");
			
		String str = reader.readLine();
		int age = Integer.parseInt(str);
		
		Student05 studentB = new Student05();
		studentB.setName();
		studentB.setAge();
		
		System.out.println("studentA の名前は"+ name + "年齢は" + age + "歳です");
		System.out.println("Student05 クラスで生成したオブジェクトの数は" + totalStudent + "です。");
				
				
				
				
				
		
		
		
		
	}

}
