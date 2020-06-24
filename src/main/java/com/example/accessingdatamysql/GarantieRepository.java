package com.example.accessingdatamysql;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Garantie;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GarantieRepository extends JpaRepository<Garantie, Integer> {


	  Optional<Garantie> findById(int id);
	  
	  
  
}