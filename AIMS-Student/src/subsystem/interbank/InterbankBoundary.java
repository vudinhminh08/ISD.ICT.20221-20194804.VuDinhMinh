package subsystem.interbank;

import common.exception.UnrecognizedException;
import utils.Application_programming_interface;

public class InterbankBoundary {

	String query(String url, String data) {
		String response = null;
		try {
			response = Application_programming_interface.post(url, data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new UnrecognizedException();
		}
		return response;
	}

}
