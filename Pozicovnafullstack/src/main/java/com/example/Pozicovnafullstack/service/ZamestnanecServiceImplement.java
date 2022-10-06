package com.example.Pozicovnafullstack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Pozicovnafullstack.model.Zamestnanec;
import com.example.Pozicovnafullstack.repository.ZamestnanecRepository;
@Service
public class ZamestnanecServiceImplement implements ZamestnanecService {

    @Autowired
    private ZamestnanecRepository zamestnanecRepository;

    @Override
    public Zamestnanec savezZamestnanec(Zamestnanec zamestnanec) {
        
        return zamestnanecRepository.save(zamestnanec);
    }

    

    
}
