package com.dio.desafioifood.controller;


import com.dio.desafioifood.model.Customer;
import com.dio.desafioifood.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customers")
@RestController
public class CustomerRestController {
    @Autowired
    CustomerService _customerService;

    @GetMapping
    public ResponseEntity<Iterable<Customer>> buscarTodos() {
        return ResponseEntity.ok(_customerService.buscarTodos());
    }

    @GetMapping("/id")
    public ResponseEntity<Customer> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(_customerService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Customer> inserir(@RequestBody Customer cliente) {
        _customerService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> atualizar(@PathVariable Long id, @RequestBody Customer cliente) {
        _customerService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        _customerService.deletar(id);
        return ResponseEntity.ok().build();

    }

}
