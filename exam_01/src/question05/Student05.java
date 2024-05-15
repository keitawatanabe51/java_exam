package question05;

public class Student05 {

	String name;
	int age;
	static int totalStudent;
	
	
	
	public Student05(){
		totalStudent++;
	}
		public Student05(String name,int age) {
		this();
		this.name = name;
		this.age = age;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static int getTotalStudent() {
		return totalStudent;
	}
	public static void setTotalStudent(int totalStudent) {
		Student05.totalStudent = totalStudent;
	}
	
	
	
	
}
