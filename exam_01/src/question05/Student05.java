package question05;

public class Student05 {

	String name;
	int age;
	static int totalStudent;

	public Student05() {
		totalStudent++;
	}
	
	public Student05(String name, int age) {
		this.name = name;
		this.age = age;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	static void setTotalStudent(int totalStudent) {
		
	}
	
	static int getTotalStudent(){
		
	}
	
}
