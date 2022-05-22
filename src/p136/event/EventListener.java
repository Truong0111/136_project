package p136.event;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import p136.main.Window;

public class EventListener  {
	JButton button;
	
	public void setUpButtonListeners() {
		ActionListener buttonListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked");
				
			}
		};
		button.addActionListener(buttonListener);
	}
}
