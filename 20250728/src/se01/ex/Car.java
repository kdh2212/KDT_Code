package se01.ex;

public class Car {

	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 없스빈다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달랍니다.(gas잔량:" + gas +")");
				gas -=1;
			}else {
				System.out.println("멈춥니다.(gas잔량:"+ gas +")");
				return;
			}
		}
	}
	
	
	
	
}
