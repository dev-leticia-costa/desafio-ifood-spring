package com.dio.desafioifood.service;


import com.dio.desafioifood.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Address consultarCep(@PathVariable("cep") String cep);
}
