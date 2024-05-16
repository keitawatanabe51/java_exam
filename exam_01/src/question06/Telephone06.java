package question06;

public class Telephone06 {
	String phoneNumber;
	int fee;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getFee() {
		return fee;
	}
	
	public void setFee(int fee) {
		this.fee = fee;
	}
	public void showInfo() {
		System.out.println("「Telephone06 クラスで格納されている電話番号は"
			+ phoneNumber + "で、料金は" + fee + "円です。");
	}
	
}
