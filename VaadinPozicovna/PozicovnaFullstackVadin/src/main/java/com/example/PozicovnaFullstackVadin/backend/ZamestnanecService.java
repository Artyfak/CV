package com.example.PozicovnaFullstackVadin.backend;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ZamestnanecService implements CrudListener<Zamestnanec> {

    private final ZamestnanecRepo repo; 

    @Override
    public Collection<Zamestnanec> findAll() {
        
        return repo.findAll();
    }

    @Override
    public Zamestnanec add(Zamestnanec domainObjectToAdd) {
        
        return repo.save(domainObjectToAdd);
    }

    @Override
    public Zamestnanec update(Zamestnanec domainObjectToUpdate) {
        
        return repo.save(domainObjectToUpdate);
    }

    @Override
    public void delete(Zamestnanec domainObjectToDelete) {
        repo.delete(domainObjectToDelete);
        
    }
    
}
