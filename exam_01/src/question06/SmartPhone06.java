package question06;

public class SmartPhone06 extends Telephone06 {
	
	double internetSpeed;

	public double getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(double internetSpeed) {
		this.internetSpeed = internetSpeed;
	}
	
	public void showInfo() {
		System.out.println("SmartPhone06 クラスで格納されている通信速度は" +
				getInternetSpeed() + "Mbps です。」");
	}
	
}