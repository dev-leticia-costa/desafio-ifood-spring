package com.dio.desafioifood.model;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//JPA repository x CRUD repository -->
@Repository
public interface AddressRepository extends CrudRepository<Address, String> {
    @Override
    default <S extends Address> S save(S entity) {
        return null;
    }

    @Override
    default <S extends Address> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<Address> findById(String s) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(String s) {
        return false;
    }

    @Override
    default Iterable<Address> findAll() {
        return null;
    }

    @Override
    default Iterable<Address> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(String s) {

    }

    @Override
    default void delete(Address entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    default void deleteAll(Iterable<? extends Address> entities) {

    }

    @Override
    default void deleteAll() {

    }
}
