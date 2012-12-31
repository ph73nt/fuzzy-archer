package couk.fishlegs.nucmedone.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>ChamberUpdater</code>.
 */
public interface ChamberUpdaterAsync {

	void getReading(int input, AsyncCallback<Float> callback)
		throws IllegalArgumentException;
	
}
