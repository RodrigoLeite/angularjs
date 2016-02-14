package com.digao.listatelefonica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digao.listatelefonica.domain.Operadora;

@Repository
public interface OperadoraRepository extends JpaRepository<Operadora, Long> {

}
