package couk.fishlegs.nucmedone.client.chamber;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dev.shell.CheckForUpdates.UpdateResult;
import com.google.gwt.user.client.rpc.AsyncCallback;

import couk.fishlegs.nucmedone.client.ChamberUpdater;
import couk.fishlegs.nucmedone.client.ChamberUpdaterAsync;

public class ClientChamber {
	
	private float res = Float.NaN;
	
	private ChamberUpdaterAsync chamberUpdater = GWT.create(ChamberUpdater.class);
	
	public ClientChamber() {
		
	}
	
	public float getReading() {
		
		// Initialise proxy
		if (chamberUpdater == null){
			chamberUpdater = GWT.create(ChamberUpdater.class);
		}
		
		// Set up the callback
		AsyncCallback<Float> callback = new AsyncCallback<Float>() {
			
			public void onFailure(Throwable caught){
				//TODO: do something
			}

			@Override
			public void onSuccess(Float result) {
				res = result.floatValue();	
			}
			
		};
		
		chamberUpdater.getReading(0, callback);
		
		return res;
	}
	
}
