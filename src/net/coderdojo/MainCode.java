package net.coderdojo;

public class MainCode {
	public boolean initAPI(String API_KEY, String USR_NME) {
		if (API_KEY == "000-000-000") {
			if (USR_NME == "GamingCraft_hd") {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
