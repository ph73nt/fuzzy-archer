package couk.fishlegs.NucMedOne.server.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import couk.fishlegs.NucMedOne.client.security.AuthService;

public class AuthServiceImpl extends RemoteServiceServlet implements
		AuthService {

	private static final long serialVersionUID = 4363442349243130030L;

	@Override
	public String retrieveUsername() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		if(authentication == null) {
			System.out.println("Not logged in");
			return null;
		} else {
			return authentication.getPrincipal().toString();
		}
		
	}

}
