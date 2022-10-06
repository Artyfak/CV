package com.example.PozicovnaFullstackVadin.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ZamestnanecRepo extends JpaRepository<Zamestnanec, Integer>{
    
}
