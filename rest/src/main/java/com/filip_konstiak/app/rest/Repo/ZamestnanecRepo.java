package com.filip_konstiak.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filip_konstiak.app.rest.Models.Zamestnanec;

public interface ZamestnanecRepo extends JpaRepository<Zamestnanec, Integer>{
    
}
