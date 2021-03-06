package br.com.atech.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.atech.entity.Company;

public interface CompanyService {

    Page<Company> findAll(Pageable pageable);

    Company findOneById(Long id);

    Company save(Company company);
}
