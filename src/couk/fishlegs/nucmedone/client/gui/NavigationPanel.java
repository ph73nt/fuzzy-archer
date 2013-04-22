package couk.fishlegs.nucmedone.client.gui;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.VerticalPanel;

public class NavigationPanel {
	
	private NavigationPanel() {
	}
	
	public static VerticalPanel getNavigationPanel(){
		
		// Make an enclosing panel
		VerticalPanel navPanel = new VerticalPanel();
		navPanel.setSpacing(5);

		final HTML breaker1 = new HTML("<hr>");
		navPanel.add(breaker1);
		
		final Label dispensingLabel = new Label("Dispensing");
		navPanel.add(dispensingLabel);
		final ToggleButton one = new ToggleButton("Tee-up");
		navPanel.add(one);
		final ToggleButton two = new ToggleButton("Assay");
		navPanel.add(two);
		final ToggleButton dispBtn = new ToggleButton("Batch print");
		navPanel.add(dispBtn);
		final ToggleButton four = new ToggleButton("Transport Certs");
		navPanel.add(four);
		
		final HTML breaker2 = new HTML("<hr>");
		navPanel.add(breaker2);
		
		final Label qcLabel = new Label("Quality Control");
		navPanel.add(qcLabel);
		final ToggleButton five = new ToggleButton("Molybdenum Assay");
		navPanel.add(five);
		final ToggleButton six = new ToggleButton("Aluminium breakthrough");
		navPanel.add(six);
		final ToggleButton seven = new ToggleButton("Environmental");
		navPanel.add(seven);
		final ToggleButton eight = new ToggleButton("Chamber QC");
		navPanel.add(eight);
		
		final HTML breaker3 = new HTML("<hr>");
		navPanel.add(breaker3);
		
		final Label stockLabel = new Label("Stock Control");
		navPanel.add(stockLabel);
		final ToggleButton nine = new ToggleButton("Consumables");
		navPanel.add(nine);
		final ToggleButton ten = new ToggleButton("Cold Kits");
		navPanel.add(ten);
		final ToggleButton eleven = new ToggleButton("Generators");
		navPanel.add(eleven);
		
		final HTML breaker4 = new HTML("<hr>");
		navPanel.add(breaker4);
		
		final Label activityLabel = new Label("Activity Summary");
		navPanel.add(activityLabel);
		final ToggleButton twelve = new ToggleButton("On-site Activity");
		navPanel.add(twelve);
		final ToggleButton thirteen = new ToggleButton("Waste");
		navPanel.add(thirteen);
		final ToggleButton fourteen = new ToggleButton("Background monitoring");
		navPanel.add(fourteen);
		
		final HTML breaker5 = new HTML("<hr>");
		navPanel.add(breaker5);
		

		
		navPanel.addStyleName("navigationPanel");
		
		return navPanel;
		
	}

}
