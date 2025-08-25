package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * 아직 미 완성 
 */


class MyFrame extends JFrame implements ActionListener{
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JButton jb5;
	
	
	JTextField jt1;
	JTextField jt2;
	JTextField jt3;

	JLabel lab1;
	JLabel lab2;
	JLabel lab3;
	JLabel lab4;
	
	
	int balance = 0;
	String name = "홍길동";
	String account = "1234";
	boolean login = false;
	
	public MyFrame() {  // 생성자
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = this.getContentPane();
		cp.setLayout(null);
		
		jb1 = new JButton("입금");  // 버튼 생성
		jb1.setBounds(10, 20, 70, 30);
		cp.add(jb1);
		
		jb2 = new JButton("출금");  // 버튼 생성
		jb2.setBounds(100, 20, 70, 30);
		cp.add(jb2);
		
		jb3 = new JButton("확인");  // 버튼 생성
		jb3.setBounds(200, 200, 70, 30);
		cp.add(jb3);
		
		jb4 = new JButton("로그인");  // 버튼 생성
		jb4.setBounds(300, 200, 70, 30);
		cp.add(jb4);
		
		
		jb5 = new JButton("회원가입");  // 버튼 생성
		jb5.setBounds(400, 200, 100, 30);
		cp.add(jb5);
		
		lab1 = new JLabel("금액");
		lab1.setBounds(200,20,70,30);
		cp.add(lab1);
		
		
		lab2 = new JLabel("잔고: " +  balance +"원");  // 버튼 생성
		lab2.setBounds(10, 200, 100, 30);
		cp.add(lab2);
		
		lab3 = new JLabel("이름");
		lab3.setBounds(10,60,70,30);
		cp.add(lab3);
		
		lab4 = new JLabel("계정");
		lab4.setBounds(10,100,70,30);
		cp.add(lab4);
		
		jt1 = new JTextField();
		jt1.setBounds(250, 20, 70, 30);
		cp.add(jt1);
		
		jt2 = new JTextField();
		jt2.setBounds(50, 60, 70, 30);
		cp.add(jt2);
		
		jt3 = new JTextField();
		jt3.setBounds(50, 100, 70, 30);
		cp.add(jt3);
		
		this.setVisible(true);
		this.setSize(550, 300);
		this.setLocation(800, 200);
		this.setTitle("자바 스윙 1.0");
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if(!login) {
//			JOptionPane.showMessageDialog(this, "로그인 하세요");
//			return;
//		}
		if (e.getSource() == jb1) {
//			System.out.println(jt1.getText());
			int money = Integer.parseInt(jt1.getText());
			balance += money;
			lab2.setText("잔고: "+ balance + "원");
			jt1.setText("");
			
		} else if (e.getSource() == jb2) {
//			System.out.println("출금");
			int money = Integer.parseInt(jt1.getText());
			balance -= money;
			lab2.setText("잔고: "+ balance + "원");
			jt1.setText("");
		}else if(e.getSource() == jb3) {
//			JOptionPane.showInputDialog("이름 입력: ");
//			JOptionPane.showMessageDialog(this,"에러");
			int ret = JOptionPane.showConfirmDialog(this, "확인");
			System.out.println(ret);
		}else if(e.getSource() == jb4) {
			String name2 = jt2.getText();
			jt2.setText("");
			String account2 = jt3.getText();
			jt3.setText("");
			if(name.equals(name2) && account.equals(account2)) {
				JOptionPane.showMessageDialog(this, "로그인 완료");
			}else {
				JOptionPane.showMessageDialog(this, "로그인 실패");
			}

		}else if(e.getSource() == jb5) {
			String name2 = jt2.getText();
			jt2.setText("");
			String account2 = jt3.getText();
			jt3.setText("");
			name = name2;
			account = account2;
			if(name.equals(name2) && account.equals(account2)) {
				JOptionPane.showMessageDialog(this, "회원가입 완료");
			}else {
				JOptionPane.showMessageDialog(this, "회원가입 하세요");
			}
			
		}

		
	}

}
public class MyWin {

	public static void main(String[] args) {
		new MyFrame();
		

	}

}
