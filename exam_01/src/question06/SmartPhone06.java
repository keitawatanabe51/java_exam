package question06;

public class SmartPhone06 extends Telephone06 {
	
	/**通信速度*/
	double internetSpeed;
	
	/**
	 * 	通信速度を取得
	 * 
	 * @return 通信速度
	 */
	public double getInternetSpeed() {
		return internetSpeed;
	}
	
	/**
	 * 通信速度を設定
	 * 
	 * @param internetSpeed　通信速度
	 */
	public void setInternetSpeed(double internetSpeed) {
		this.internetSpeed = internetSpeed;
	}
	
	/**
	 *通信速度を表示
	 */
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("SmartPhone06 クラスで格納されている通信速度は" +
			this.internetSpeed + "Mbps です。");
	}
	
}