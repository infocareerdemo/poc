package com.reactive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reactive.entity.CompanyDetails;
import com.reactive.repository.CompanyDetailsRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CompanyDetailsService {
	@Autowired
	CompanyDetailsRepository companyDetailsRepository;

	public Flux<CompanyDetails> showAllCompanyDetails() {
		List<CompanyDetails> userDetails = companyDetailsRepository.findAll();
		Flux<CompanyDetails> users = Flux.fromIterable(userDetails);
		return users;
	}

	public Mono<String> saveCompanyDetails(CompanyDetails companyDetails) {
		companyDetailsRepository.save(companyDetails);
		return Mono.just("CompanyDetails saved");
	}

}
