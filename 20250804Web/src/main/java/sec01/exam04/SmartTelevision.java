package sec01.exam04;

public class SmartTelevision implements RemoteControl, Searchable{ // 다중상속
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Smart TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		}else if(volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Smart TV 볼륨:" + this.volume);
		
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}
	
}
