package com.reactive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reactive.entity.CompanyDetails;
@Repository
public interface CompanyDetailsRepository extends JpaRepository<CompanyDetails,Long>{

}
