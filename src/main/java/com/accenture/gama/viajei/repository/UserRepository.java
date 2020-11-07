package com.accenture.gama.viajei.repository;


import java.util.List;

import com.accenture.gama.viajei.model.ApplicationUser;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {
    
    ApplicationUser findByUsername(String username);

}