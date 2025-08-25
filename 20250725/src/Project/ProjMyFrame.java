package Project;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/*
 * 미완성
 * 
 */

public class ProjMyFrame extends JFrame{
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JButton jb5;
	JButton jb6;
	
	JLabel  lab1;
	JLabel  lab2;
	JLabel  lab3;
	
	JTextField jt1;
	JTextField jt2;
	JTextField jt3;
	JTextField jt4;
	JTextField jt5;
	
	
	public ProjMyFrame(){
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(600,300);
		this.setSize(1000, 500);
		
		
		
		jb1 = new JButton("로그인");
		jb1.setBounds(300, 400, 90, 40);
		con.add(jb1);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		jb2 = new JButton("회원가입");
		jb2.setBounds(400, 400, 90, 40);
		con.add(jb2);
		
		jb3 = new JButton("종료");
		jb3.setBounds(500, 400, 90, 40);
		con.add(jb3);
		
		lab1 = new JLabel("이름");
		lab1.setBounds(10, 400, 80, 40);
		con.add(lab1);
		
		jt1 = new JTextField();
		jt1.setBounds(50, 400, 80, 40);
		con.add(jt1);
		
		lab2 = new JLabel("계정");
		lab2.setBounds(150, 400, 80, 40);
		con.add(lab2);
		
		jt2 = new JTextField();
		jt2.setBounds(190, 400, 80, 40);
		con.add(jt2);
		
		
		lab3 = new JLabel("로그인이 안된 상태");  // 로그인 상태 정보
		lab3.setBounds(700, 400, 170, 40);
		con.add(lab3);
		
		jb4 = new JButton("과목수");
		jb4.setBounds(150, 30, 80, 40);
		con.add(jb4);
		
		
		jt3 = new JTextField();
		jt3.setBounds(50, 30, 80, 40);
		con.add(jt3);
		
		jt4 = new JTextField();
		jt4.setBounds(150, 80, 80, 40);
		con.add(jt4);
		
		jt5 = new JTextField();
		jt5.setBounds(50, 80, 80, 40);
		con.add(jt5);
		
		jb4 = new JButton("확인");
		jb4.setBounds(250, 80, 90, 40);
		con.add(jb4);
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		new ProjMyFrame();
		

	}

}
