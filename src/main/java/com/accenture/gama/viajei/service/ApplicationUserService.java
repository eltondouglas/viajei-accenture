package com.accenture.gama.viajei.service;

import com.accenture.gama.viajei.model.ApplicationUser;
import com.accenture.gama.viajei.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserService implements UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    //@Autowired
    //private AuthorityRepository authorityRepository;

    public ApplicationUser create(ApplicationUser model) {
        model.setPassword(this.bCryptPasswordEncoder.encode(model.getPassword()));
        //this.authorityRepository.saveAll(model.getAuthorities());
        return this.userRepository.save(model);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            ApplicationUser user = this.userRepository.findByUsername("TESTE@TESTE");
            return new User(user.getUsername(), user.getPassword(), user.getAuthorities());
        } catch (RuntimeException e) {
            throw new UsernameNotFoundException(e.getMessage());
        }

    }

    public BCryptPasswordEncoder getbCryptPasswordEncoder() {
        return bCryptPasswordEncoder;
    }

    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}