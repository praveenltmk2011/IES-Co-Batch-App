package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Eligibility_Details;

@Repository
public interface EligibilityDetailsRepository extends JpaRepository<Eligibility_Details, Serializable> {

}
