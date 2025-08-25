package sec02.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
/*
 * Quiz
 * Scanner를 사용하여 주문정보를 입력 받아서 파일에 저장하고
 * 파일의 내용을 출력하는 자바 프로그램을 만들어 보세요.
 */
public class OrderService {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		String orderId;
		String product;
		int quantity;
		
		Order order = null;
		
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 주문 입력 | 2. 주문 저장 | 3. 주문 불러오기 | 4. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("입력>");
			int num = Integer.parseInt(scan.nextLine());
			switch (num) {
			case 1:
				System.out.print("주문 ID 입력>");
				orderId = scan.nextLine();
				System.out.print("상품명>");
				product = scan.nextLine();
				System.out.print("입력>");
				quantity = Integer.parseInt(scan.nextLine());
				
				order =new Order(orderId,product,quantity);
				break;
			case 2:
				if (order != null) {
					try (ObjectOutputStream oos
							= new ObjectOutputStream(new FileOutputStream("c:/tmp/order5.dat"))){
						oos.writeObject(order);
						System.out.println("주문 객체가 파일에 저장되었습니다.");
					}catch(IOException e) {
						e.printStackTrace();
					}
				}else {
					System.err.println("주문 입력을 먼저 하세요.");
					num = 1;
				}
				break;
			case 3:
				try (ObjectInputStream ois= new ObjectInputStream(new FileInputStream("c:/tmp/order5.dat"))){
					order = (Order) ois.readObject();
					System.out.println("파일에서 주문 객체를 읽어왔습니다.");
					order.print();
				}catch(IOException | ClassNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("종료");

		
	}
}
