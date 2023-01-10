package com.example.Ejercicio456.controllers;

import com.example.Ejercicio456.entities.Laptop;
import com.example.Ejercicio456.repositories.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/laptops")
    public List<Laptop> findAll(){

        return laptopRepository.findAll();
    }


    @PostMapping("/laptops")
    public Laptop create(@RequestBody Laptop Laptop, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return laptopRepository.save(Laptop);
    }
}
