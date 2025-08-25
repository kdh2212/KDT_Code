package sec01.exam04;

public interface RemoteControl {
	
	// 상수
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
