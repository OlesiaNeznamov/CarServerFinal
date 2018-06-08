package telran.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
@Configuration
public class AccountingCheck implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if(!username.equals("Vasya"))
			throw new UsernameNotFoundException("");
		return new User(username, "12345.com", AuthorityUtils.createAuthorityList("ROLE_USER"));
	}

}
