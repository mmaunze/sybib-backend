package com.esib.esib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esib.esib.modelo.Cargo;

public interface CargoRepository  extends JpaRepository<Cargo, Long>{
    
}
