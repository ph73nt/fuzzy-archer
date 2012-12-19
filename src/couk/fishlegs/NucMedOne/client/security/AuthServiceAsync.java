package couk.fishlegs.NucMedOne.client.security;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AuthServiceAsync {
	void retrieveUsername(AsyncCallback<String> callback);
}
