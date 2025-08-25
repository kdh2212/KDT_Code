package sec01.exam04;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		RemoteControl rc ; 
//		rc = new Television();
//		rc = new Audio();
//		rc.turnOn();
//		rc.setVolume(10);
//		rc.turnOff();
		rc = new RemoteControl() { // 익명의 구현 객체 생성 video인데 video인지 모른데 그래서 익명이다.
			private int volume= 0;

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
				System.out.println("현재 Audio 볼륨:" + this.volume);
				
				
			}
			
		};
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		
//		Television tv = new Television();
//		Audio audio = new Audio();
		
//		tv.turnOn();
//		tv.setVolume(10);
//		tv.turnOff();
//		
//		audio.turnOn();
//		audio.setVolume(0);
//		audio.turnOff();
		


	}

}
