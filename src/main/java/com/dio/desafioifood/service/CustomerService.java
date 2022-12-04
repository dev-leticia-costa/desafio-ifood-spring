package com.dio.desafioifood.service;


import com.dio.desafioifood.model.Customer;

//@author falvojr
//implementação do padrão Strategy --> possibilida multiplas implementações na mesma interface
public interface CustomerService {

// criar metodos base

    Iterable<Customer> buscarTodos();

    Customer buscarPorId(Long id);

    void inserir(Customer cliente);

    void atualizar(Long id, Customer cliente);

    void deletar(Long id);


}
