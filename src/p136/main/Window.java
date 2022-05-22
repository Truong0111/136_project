package p136.main;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import p136.event.EventListener;

public class Window extends JFrame{
	
	private JFrame frame;
	private JButton button;
	private int width;
	private int height;
	
	public Window() {
		this.setTitle("Project");
		this.setSize(1280,720);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel lb1 = new JLabel();
		
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		
		pn1.setLayout(new BorderLayout());
		JTextField jTextField = new JTextField(50);
		pn1.add(jTextField, BorderLayout.CENTER);
		
		JButton btn1 = new JButton("Info");
		JButton btn2 = new JButton("OK");
		JButton btn3 = new JButton("Cancel");
		
		
		
		pn2.setLayout(new GridLayout());
		pn2.add(btn1);
		pn2.add(btn2);
		pn2.add(btn3);

		this.add(pn1, BorderLayout.NORTH);
		this.add(pn2, BorderLayout.CENTER);

	}
	
	
	public void showWindow() {
		this.setVisible(true);
	}
	
	
}
