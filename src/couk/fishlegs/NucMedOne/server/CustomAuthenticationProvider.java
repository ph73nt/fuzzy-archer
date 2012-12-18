package couk.fishlegs.NucMedOne.server;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomAuthenticationProvider implements AuthenticationProvider {

	private static Map<String, String> users = new HashMap<String, String>();

	static {
		users.put("Neil", "wiggle");
		users.put("Jeff", "Bumble");
	}

	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		
		String username = authentication.getPrincipal().toString();
		String storedPass = users.get(username);
		if(storedPass == null){
			throw new UsernameNotFoundException("User not found");
		}
		
		String password = authentication.getCredentials().toString();
		if(storedPass != password){
			throw new BadCredentialsException("Password does not match");
		}
		
		Authentication customAuthentication = new CustomUserAuthentication("ROLE_USER", authentication);
		customAuthentication.setAuthenticated(true);
		
		return customAuthentication;
	}

	@Override
	public boolean supports(Class<? extends Object> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
