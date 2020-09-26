package Polinators_20.service;

import Polinators_20.repository.UserActionRepository;
import Polinators_20.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDetailsRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Polinators_20.model.User user = userRepository.findByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        return new User(user.getUserName(), user.getPassword(), new ArrayList<>());
    }
}