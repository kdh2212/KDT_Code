package se01.ex;

public class SeasonEx1 {

	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s.name() +"\t"+s.name +"\t"+ s.temp);
		}

	}

}
