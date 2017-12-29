package com.kairala.course.repositories;

import com.kairala.course.models.Entrada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepository extends CrudRepository<Entrada, Long> {
}
