package com.EAUTPL.sistema_ordeno.repository;


import com.EAUTPL.sistema_ordeno.model.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}