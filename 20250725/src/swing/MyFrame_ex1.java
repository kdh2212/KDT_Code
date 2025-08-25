package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
 * 
 */

public class MyFrame_ex1 extends JFrame{
	JButton jb1 = new JButton("확인");
	
	public MyFrame_ex1() {
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(800,300);
		this.setSize(400, 400);
		
		jb1.setBounds(10, 20, 80, 50);
		con.add(jb1);
		jb1.addActionListener(new ActionListener() {  // 버튼마다 기능을 준다. 전에 껄로는 버튼마다 조건을 줬어야 했다.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	public static void main(String[] args) {
		new MyFrame_ex1();
		

	}

}
