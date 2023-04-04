package com.bootstrap.service.application

import com.bootstrap.service.application.dtos.CustomerResult
import com.bootstrap.service.domain.customer.repositories.CustomerRepository
import javax.enterprise.context.ApplicationScoped


class CustomerCrudUseCases(
    private val customerRepository: CustomerRepository
) {

    fun findAll(): List<CustomerResult> = customerRepository.findAll()

}