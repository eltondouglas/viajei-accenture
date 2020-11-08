package com.accenture.gama.viajei.repository;



import com.accenture.gama.viajei.model.perfil.Authority;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends PagingAndSortingRepository<Authority, Long> {
    
}