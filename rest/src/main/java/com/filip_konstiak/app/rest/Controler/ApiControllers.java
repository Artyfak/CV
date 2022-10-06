package com.filip_konstiak.app.rest.Controler;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.filip_konstiak.app.rest.Models.Zamestnanec;
import com.filip_konstiak.app.rest.Repo.ZamestnanecRepo;

@RestController
@CrossOrigin
public class ApiControllers {

    @Autowired
    private ZamestnanecRepo repo;
    
    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";

    }

    @GetMapping(value = "/lol")
    public List<Zamestnanec> getZamestnanec() {
        return repo.findAll();
    }

    @PostMapping(value = "/uloz")
    public String saveZamestnanec(@RequestBody Zamestnanec zamestnanec) {
        repo.save(zamestnanec);
        return "Saved...";
    }

    @PutMapping(value = "update/{id}")
    public String updateZamestnanec (@PathVariable int id, @RequestBody Zamestnanec zamestnanec) {
        Zamestnanec updatedZamestnanec = repo.findById(id).get();
        updatedZamestnanec.setMeno(zamestnanec.getMeno());
        updatedZamestnanec.setPriezvisko(zamestnanec.getPriezvisko());
        updatedZamestnanec.setSex(zamestnanec.getSex());
        repo.save(updatedZamestnanec);
        return "updated";
    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteZamestnanec (@PathVariable int id) {
        Zamestnanec deletedZamestnanec = repo.findById(id).get();
        repo.delete(deletedZamestnanec);
        return "deleted zamestnanec s id : "+id;
    }
    
    
}
