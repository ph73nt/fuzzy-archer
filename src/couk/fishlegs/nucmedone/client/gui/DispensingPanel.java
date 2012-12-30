package couk.fishlegs.nucmedone.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DispensingPanel {
	
	public static final String UNIT_MEGABEQUEREL ="MBq";
	public static final String UNIT_KILOBEQUEREL = "KBq";
	public static final String UNIT_MILLICURIE = "mCi";
	
	
	private DispensingPanel() {
		
	}
	
	public static VerticalPanel getDispensingPanel(){
		
		// Area to sit the components in
		VerticalPanel vpanel = new VerticalPanel();
		
		// Series of "questions for the user to complete
		final Label idLbl = new Label("Identitiy");
		final TextBox idTxt = new TextBox();
		
		final Label radiopharmLbl = new Label("Radiopharmaceutical");
		final TextBox radiopharmTxt = new TextBox();
		
		final Label adminLbl = new Label("Administration Activity");
		final TextBox adminTxt = new TextBox();
		final ListBox adminUnits = new ListBox();
		adminUnits.addItem(UNIT_MEGABEQUEREL);
		adminUnits.addItem(UNIT_KILOBEQUEREL);
		adminUnits.addItem(UNIT_MILLICURIE);
		
		final Label siteLbl = new Label("Site");
		final TextBox siteTxt = new TextBox();
		
		final Label expLbl = new Label("Expiry");
		final TextBox expTxt = new TextBox();
		
		// Somewhere to align them nicely
		Grid dispensingGrid = new Grid(5,3);
		
		int row = 0;
		dispensingGrid.setWidget(row, 0, idLbl);
		dispensingGrid.setWidget(row, 1, idTxt);
		dispensingGrid.setWidget(++row, 0, radiopharmLbl);
		dispensingGrid.setWidget(row, 1, radiopharmTxt);
		dispensingGrid.setWidget(++row, 0, adminLbl);
		dispensingGrid.setWidget(row, 1, adminTxt);
		dispensingGrid.setWidget(row, 2, adminUnits);
		dispensingGrid.setWidget(++row, 0, siteLbl);
		dispensingGrid.setWidget(row, 1, siteTxt);
		dispensingGrid.setWidget(++row, 0, expLbl);
		dispensingGrid.setWidget(row, 1, expTxt);
		
		// Buttons
		final Button clear = new Button("Clear");
		clear.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				idTxt.setText("");
				radiopharmTxt.setText("");
				adminTxt.setText("");
				adminUnits.setSelectedIndex(0);
				siteTxt.setText("");
				expTxt.setText("");
			}
		});
		
		final Button submit = new Button("Print Label");
		
		HorizontalPanel btnPanel = new HorizontalPanel();
		btnPanel.setSpacing(5);
		btnPanel.add(clear);
		btnPanel.add(submit);
		
		// Add stuff to the vertical panel
		vpanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
		vpanel.add(dispensingGrid);
		vpanel.add(btnPanel);
		
		return vpanel;
		
	}

}
