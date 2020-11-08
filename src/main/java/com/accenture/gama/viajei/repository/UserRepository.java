package com.accenture.gama.viajei.repository;



import com.accenture.gama.viajei.model.perfil.ApplicationUser;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

    @Query("SELECT u FROM ApplicationUser u WHERE u.username = ?1")
    ApplicationUser findByUsername(String username);

    //Optional<ApplicationUser> findById(Long id);

}