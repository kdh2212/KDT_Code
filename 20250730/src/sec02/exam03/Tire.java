	package sec02.exam03;
	
	public class Tire {
		//필드
		public int maxRoatation;// 타이어의 수명: 최대 회전 수
		public int accumulatedRotation; // 누적 회전수
		public String location; // 타이어의 위치
		
		// 생성자
		public Tire(String location,int maxRoatation) {
			super();
			this.maxRoatation = maxRoatation;
			this.location = location;
		}
		
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRoatation) {
				System.out.println(location + "Tire 수명:" + (maxRoatation-accumulatedRotation)+"회");
				return true;
			}else {
				System.out.println("***" + location + "Tire 펑크***");
				return false;
			}
		}
		
	}
