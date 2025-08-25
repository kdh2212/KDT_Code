package sec01.example.jdbc;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OrderWin3 extends JFrame {

	String id = "root";
	String pw = "1234";
	String url = "jdbc:mysql://localhost:3305/DoItSQL";
	Connection conn = null;
	Statement stmt =null;
	ResultSet rs = null;
	String sql = "select * from order0729";
	
	JLabel lb1 = new JLabel("주문 ID");
	JLabel lb2 = new JLabel("주문 상품");
	JLabel lb3 = new JLabel("주문 수량");
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JButton btn1 = new JButton("저장");
	JButton btn2 = new JButton("불러오기");
	JTextArea ta = new JTextArea();
	
	public OrderWin3() {
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Driver 이름 앞에는 패키지
			System.out.println("드라이버 로딩!");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("접속 성공!");
			stmt = conn.createStatement();
			}catch(ClassNotFoundException | SQLException e) {
				System.out.println("접속 안됨!");
			}
		
		
		
		con.add(lb1);
		lb1.setBounds(30, 10, 80, 40);
		con.add(lb2);
		lb2.setBounds(120, 10, 80, 40);
		con.add(lb3);
		lb3.setBounds(210, 10, 80, 40);
		
		con.add(tf1);
		tf1.setBounds(30, 50, 80, 40);
		con.add(tf2);
		tf2.setBounds(120, 50, 80, 40);
		con.add(tf3);
		tf3.setBounds(210, 50, 80, 40);
		
		con.add(btn1);
		btn1.setBounds(30, 100, 80, 40);
		
		con.add(btn2);
		btn2.setBounds(120, 100, 90, 40);
		
		JScrollPane sp = new JScrollPane(ta);
		
		
		sp.setBounds(30, 150, 250, 70);
		con.add(sp);
		
		this.setSize(400, 300);
		this.setLocation(800, 400);
		this.setTitle("주문 입력 시스템 v1.0");
		this.setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String orderId = tf1.getText();
				String product = tf2.getText();
				int quantity = Integer.parseInt(tf3.getText());
				
				sql = String.format("insert into order0729( order_id, product, quantity) values ('%s', '%s',%d)",
						orderId,product,quantity);
				System.out.println(sql);
				try {
					stmt.execute(sql);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
			
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				try {
					sql = "select * from order0729";
					rs = stmt.executeQuery(sql);
					String str = "";
					
					while(rs.next()) {
						String orderId = rs.getString("order_id");
						String product = rs.getString("product");
						int quantity = rs.getInt("quantity"); // IntegerparsInt를 할 필요없이 getInt로 할 수 있다.
						
						str += String.format("%s\t%s\t%d\n",orderId,product,quantity);
						
//						System.out.println(orderId + "\t" + product + "\t" + quantity);
						
					}
					ta.setText(str);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		
	}

	public static void main(String[] args) {
		new OrderWin3();

	}

}




