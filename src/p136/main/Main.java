package p136.main;

import p136.event.EventListener;

public class Main {

	public static void main(String[] args) {
		Window f = new Window();
		EventListener ac = new EventListener();
		ac.setUpButtonListeners();
		f.showWindow();
		
	}

}
