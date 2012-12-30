package couk.fishlegs.nucmedone.client.gui;

import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.VerticalPanel;

public class NavigationPanel {
	
	private NavigationPanel() {
	}
	
	public static VerticalPanel getNavigationPanel(){
		
		// Make an enclosing panel
		VerticalPanel navPanel = new VerticalPanel();
		navPanel.setSpacing(5);
		
		final ToggleButton one = new ToggleButton("One");
		final ToggleButton two = new ToggleButton("Two");
		final ToggleButton dispBtn = new ToggleButton("Dispensing");
		final ToggleButton four = new ToggleButton("Four");
		
		navPanel.add(one);
		navPanel.add(two);
		navPanel.add(dispBtn);
		navPanel.add(four);
		
		return navPanel;
		
	}

}
