package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class OrderWin7 extends JFrame {
	String id = "root";
	String pw = "1234";
	String url = "jdbc:mysql://localhost:3305/BookList";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = "select * from book_0731";
	JLabel lb1 = new JLabel("책 ID");
	JLabel lb2 = new JLabel("책 이름");
	JLabel lb3 = new JLabel("책 반납날짜");
	JLabel lb4 = new JLabel("책 대출날짜");
	JLabel lb5 = new JLabel("책 수량");
	
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JTextField tf4 = new JTextField();
	JTextField tf5 = new JTextField();
	
	JButton btn1 = new JButton("저장");
	JButton btn2 = new JButton("불러오기");
	JButton btn3 = new JButton("수정");
	JButton btn4 = new JButton("삭제");
	JTextArea ta = new JTextArea();
	
	public OrderWin7() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩!");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공!");
			stmt = con.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		con.add(lb1);
		lb1.setBounds(30, 10, 80, 40);
		con.add(lb2);
		lb2.setBounds(120, 10, 80, 40);
		con.add(lb3);
		lb3.setBounds(210, 10, 80, 40);
		con.add(lb4);
		lb4.setBounds(300, 10, 80, 40);
		con.add(lb5);
		lb5.setBounds(390, 10, 80, 40);
		
		con.add(tf1);
		tf1.setBounds(30, 50, 80, 40);
		con.add(tf2);
		tf2.setBounds(120, 50, 80, 40);
		con.add(tf3);
		tf3.setBounds(210, 50, 80, 40);
		con.add(tf4);
		tf4.setBounds(300, 50, 80, 40);
		con.add(tf5);
		tf5.setBounds(390, 50, 80, 40);
		
		con.add(btn1);
		btn1.setBounds(30, 100, 80, 40);
		
		con.add(btn2);
		btn2.setBounds(120, 100, 90, 40);
		
		con.add(btn3);
		btn3.setBounds(220, 100, 80, 40);
		
		con.add(btn4);
		btn4.setBounds(320, 100, 80, 40);
		
		ta.setEditable(false);
		JScrollPane sp = new JScrollPane(ta);
		sp.setBounds(30, 150, 400, 100);
		con.add(sp);
		
		this.setSize(800, 500);
		this.setLocation(800, 400);
		this.setTitle("책 검색 시스템 v1.0");

		this.setVisible(true);
		OrderWin7.this.showOrders();
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String book_Id = tf1.getText();
				String book_name = tf2.getText();
				String book_in_date = tf3.getText();
				String book_out_date = tf4.getText();
				int book_total = Integer.parseInt(tf5.getText());

				sql = String.format("insert into book_0731(book_Id, book_name, book_in_date,book_out_date,book_total) "
						+ "values ('%s', '%s', '%s','%s',%d)", 
						book_Id, book_name, book_in_date,book_out_date,book_total);
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				showOrders();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showOrders();
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String book_id = tf1.getText();
				String book_name = tf2.getText();
				String book_in_date = tf3.getText();
				String book_out_date = tf4.getText();
				int book_total = Integer.parseInt(tf5.getText());

				sql = String.format("update book_0731 set book_name = '%s', book_in_date = '%s', book_out_date='%s',book_total = %d where book_id = '%s'", 
						book_name, book_in_date,book_out_date, book_total,book_id);
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				showOrders();
				
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String book_id = tf1.getText();

				sql = String.format("delete from book_0731 where book_id = '%s'", book_id);
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");

				showOrders();
			}
		});
		
	}
	
	public void showOrders() {
		sql = "select * from book_0731";
		try {
			rs = stmt.executeQuery(sql);
			String str = "";
			while (rs.next()) {
				String book_id = rs.getString("book_id");
				String book_name = rs.getString("book_name");
				String book_in_date = rs.getString("book_in_date");
				String book_out_date = rs.getString("book_out_date");
				int book_total= rs.getInt("book_total");
				
				str += String.format("%s\t%s\t%s\t%s\t%d\n", book_id, book_name, book_in_date,book_out_date,book_total);
				System.out.println(book_id + ", " + book_name + ", " + book_in_date + "," +book_out_date + "," + book_total );
			}
			ta.setText(str);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new OrderWin7();

	}

}




