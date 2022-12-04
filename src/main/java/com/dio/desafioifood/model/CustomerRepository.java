package com.dio.desafioifood.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository //não é indispensável, mas é interessante para melhorar o entendimento do código
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
