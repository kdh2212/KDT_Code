package sec01.exam01;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		//sc.nextLine(); // 그냥 사용하는거는 이렇게 가능하지만 변수를 이용해서 입력 데이터를 저장하여서 사용
		String inputData = sc.nextLine(); // 입력 데이터를 저장
		int z = Integer.parseInt(inputData) +10;
		System.out.print(">"+z);
	}

}
