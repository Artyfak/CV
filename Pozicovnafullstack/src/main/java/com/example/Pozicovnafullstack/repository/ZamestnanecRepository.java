
package com.example.Pozicovnafullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Pozicovnafullstack.model.Zamestnanec;


@Repository

public interface ZamestnanecRepository extends JpaRepository<Zamestnanec,Integer> {
    
}
