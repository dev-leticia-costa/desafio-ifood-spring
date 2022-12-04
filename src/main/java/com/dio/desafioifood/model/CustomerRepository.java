package com.dio.desafioifood.model;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Repository //não é indispensável, mas é interessante para melhorar o entendimento do código
public interface CustomerRepository extends JpaRepository<Customer, Long> {


    @Override
    default void flush() {

    }

    @Override
    default <S extends Customer> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    default <S extends Customer> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    default void deleteAllInBatch(Iterable<Customer> entities) {

    }

    @Override
    default void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    default void deleteAllInBatch() {

    }

    @Override
    default Customer getOne(Long aLong) {
        return null;
    }

    @Override
    default Customer getById(Long aLong) {
        return null;
    }

    @Override
    default Customer getReferenceById(Long aLong) {
        return null;
    }

    @Override
    default <S extends Customer> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    default <S extends Customer> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    default <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    default <S extends Customer> long count(Example<S> example) {
        return 0;
    }

    @Override
    default <S extends Customer> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    default <S extends Customer, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    default <S extends Customer> S save(S entity) {
        return null;
    }

    @Override
    default <S extends Customer> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default Optional<Customer> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Long aLong) {
        return false;
    }

    @Override
    default List<Customer> findAll() {
        return null;
    }

    @Override
    default List<Customer> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Long aLong) {

    }

    @Override
    default void delete(Customer entity) {

    }

    @Override
    default void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    default void deleteAll(Iterable<? extends Customer> entities) {

    }

    @Override
    default void deleteAll() {

    }

    @Override
    default List<Customer> findAll(Sort sort) {
        return null;
    }

    @Override
    default Page<Customer> findAll(Pageable pageable) {
        return null;
    }
}

