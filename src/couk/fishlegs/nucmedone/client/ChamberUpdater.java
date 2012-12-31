package couk.fishlegs.nucmedone.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("chamberUpdate")
public interface ChamberUpdater extends RemoteService {

	float getReading(int chamber);
	
}
