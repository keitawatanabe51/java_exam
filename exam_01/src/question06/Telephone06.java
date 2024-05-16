package question06;

public class Telephone06 {
	//**電話番号*/
	String phoneNumber;
	//*料金*/
	int fee;
	
	/**
	 * 電話番号を取得
	 * 
	 * @return　電話番号
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * 電話番号を設定
	 * 
	 * @param phoneNumber 電話番号
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * 料金を取得
	 * 
	 * @return	料金
	 */
	public int getFee() {
		return fee;
	}
	
	/**
	 * 料金を設定
	 * 
	 * @param fee　料金
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	/**
	 * 電話番号と料金を表示
	 */
	public void showInfo() {
		System.out.println("Telephone06 クラスで格納されている電話番号は"
			+ this.phoneNumber + "で、料金は" + this.fee + "円です。");
	}
	
}
