package com.biswas.spring_sec_demo.service;

import com.biswas.spring_sec_demo.dao.UserRepository;
import com.biswas.spring_sec_demo.model.User;
import com.biswas.spring_sec_demo.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUserName(username);
        if(user == null) {
            System.out.println("User 404!");
            throw new UsernameNotFoundException("User 404");
        }

        return new UserPrincipal(user);
    }
}
