package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.BatchRunDtls;

@Repository
public interface BatchRunDtlsRepository extends JpaRepository<BatchRunDtls, Serializable> {

}
