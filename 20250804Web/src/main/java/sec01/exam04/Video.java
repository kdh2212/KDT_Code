package sec01.exam04;

public class Video implements RemoteControl{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Video를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Video를 끕니다.");
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
		System.out.println("현재 Video 볼륨:" + this.volume);
		
	}
	
}
