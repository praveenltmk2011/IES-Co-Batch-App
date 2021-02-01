package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.CoPdfs;

@Repository
public interface CoPdfsRepository extends JpaRepository<CoPdfs, Serializable> {

}
