package com.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactive.entity.CompanyDetails;
import com.reactive.service.CompanyDetailsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CompanyDetailsController {

	@Autowired
	CompanyDetailsService companyDetailsService;

	@GetMapping("/showAllCompanyDetails")
	public Flux<CompanyDetails> showAllCompanyDetais() {

		return companyDetailsService.showAllCompanyDetails();
	}

	@PostMapping("/saveCompanyDetails")
	public Mono<String> saveCompanyDetails(@RequestBody CompanyDetails companyDetails) {

		return companyDetailsService.saveCompanyDetails(companyDetails);

	}

	@GetMapping("/demo")
	public Mono<String> demo() {
		return Mono.just("welcome to SpringReactive project");
	}
}