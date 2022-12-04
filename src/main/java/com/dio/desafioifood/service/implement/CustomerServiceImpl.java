package com.dio.desafioifood.service.implement;

import com.dio.desafioifood.model.Address;
import com.dio.desafioifood.model.AddressRepository;
import com.dio.desafioifood.model.Customer;
import com.dio.desafioifood.model.CustomerRepository;
import com.dio.desafioifood.service.CustomerService;
import com.dio.desafioifood.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository _customerRepository;

    @Autowired
    private AddressRepository _addressRepository;

    @Autowired
    private ViaCepService _viaCepService;

//implementar os métodos da Customer Service
    @Override
    public Iterable<Customer> buscarTodos() {
        return _customerRepository.findAll();
    }

    @Override
    public Customer buscarPorId(Long id) {
        Optional<Customer> cliente = _customerRepository.findById(id);
        return cliente.get();
//
    }

    // cep é a chave primária -> se o endereço existe, existe cliente - Autowired AddressRepository
    @Override
    public void inserir(Customer customer) {
        saveCustomerWithCep(customer);

    }

    @Override
    public void atualizar(Long id, Customer customer) {
        //buscar cliente por id
       Optional<Customer> customerDataBase =  _customerRepository.findById(id);
       if(customerDataBase.isPresent()){

       }

    }

    private void saveCustomerWithCep (Customer customer) {
        String cep = customer.getAddress().getCep();
        Address endereco = _addressRepository.findById(cep).orElseGet(() -> {
            //se o cliente nao existir, retorna um novo endereço e salva
            Address novoEndereco = _viaCepService.consultarCep(cep);
            _addressRepository.save(novoEndereco);
            return novoEndereco;
        });
        customer.setAddress(endereco);
        _customerRepository.save(customer);

    }
    @Override
    public void deletar(Long id) {
        _customerRepository.deleteById(id);

    }
}


