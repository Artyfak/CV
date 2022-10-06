package com.example.Pozicovnafullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pozicovnafullstack.model.Zamestnanec;
import com.example.Pozicovnafullstack.service.ZamestnanecService;

@RestController
@RequestMapping("/zamestnanec")
public class ZamestnanecController {
    @Autowired
    private ZamestnanecService zamestnanecService;
    
    @PostMapping("/add")
    public String add(@RequestBody Zamestnanec zamestnanec) {
        zamestnanecService.savezZamestnanec(zamestnanec);
        return "novy zamestnanec pridany";
    }
}
