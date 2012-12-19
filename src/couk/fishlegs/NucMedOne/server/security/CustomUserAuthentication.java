package couk.fishlegs.NucMedOne.server.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;

public class CustomUserAuthentication implements Authentication {

	private static final long serialVersionUID = 2212727166628457994L;
	private boolean authenticated;
	private GrantedAuthority grantedAuthority;
	private Authentication authentication;
	
	@SuppressWarnings("deprecation")
	public CustomUserAuthentication(String role, Authentication authentication) {
		grantedAuthority = new GrantedAuthorityImpl(role);
		this.authentication = authentication;
	}

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(grantedAuthority);
		return authorities;
	}

	@Override
	public Object getCredentials() {
		return authentication.getCredentials();
	}

	@Override
	public Object getDetails() {
		return authentication.getDetails();
	}

	@Override
	public Object getPrincipal() {
		return authentication.getPrincipal();
	}

	@Override
	public boolean isAuthenticated() {
		return authenticated;
	}

	@Override
	public void setAuthenticated(boolean isAuthenticated)
			throws IllegalArgumentException {
		
		this.authenticated = isAuthenticated;

	}

}
