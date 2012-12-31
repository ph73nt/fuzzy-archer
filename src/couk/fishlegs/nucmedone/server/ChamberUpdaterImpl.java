package couk.fishlegs.nucmedone.server;

import java.util.Random;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import couk.fishlegs.nucmedone.client.ChamberUpdater;

public class ChamberUpdaterImpl extends RemoteServiceServlet implements
		ChamberUpdater {

	private static final long serialVersionUID = 3365882867232491168L;

	@Override
	public float getReading(int chamber) {
		
		Random rnd = new Random();
		float reading = rnd.nextFloat() * 7400;
		
		return reading;
	}

}
