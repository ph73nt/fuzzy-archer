package couk.fishlegs.nucmedone.client.gui;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ChamberPanel {

	private ChamberPanel(){}
	
	public static VerticalPanel getChamberPanel(){
		
		// Make some vertical panel to hold everything
		VerticalPanel vpanel = new VerticalPanel();
				
		// Nuclide
		Label nuclide = new Label("Tc-99m");
		nuclide.addStyleName("chamber_nuclide");
		
		// A horizontal panel for nuclide
		HorizontalPanel nucPanel = new HorizontalPanel();
		nucPanel.add(nuclide);
		vpanel.add(nucPanel);
		
		// A horizontal panel for 0.0 MBq
		HorizontalPanel hpanel = new HorizontalPanel();
		hpanel.setVerticalAlignment(HorizontalPanel.ALIGN_BOTTOM);
		vpanel.add(hpanel);
		
		Label activity = new Label("00.00");
		activity.addStyleName("chamber_activity");
		hpanel.add(activity);
		
		Label units = new Label("MBq");
		units.addStyleName("chamber_units");
		hpanel.add(units);
		
		vpanel.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
		
		return vpanel;
		
	}
	
}
