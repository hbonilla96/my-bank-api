package com.brainstation.bank.demo.authConfig;

import com.brainstation.bank.demo.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
           return (UserDetails) this.userRepository.findUserByUserId(username)
                    .orElseThrow(() -> new UsernameNotFoundException("Username: " + username + " not found"));
    }
}
