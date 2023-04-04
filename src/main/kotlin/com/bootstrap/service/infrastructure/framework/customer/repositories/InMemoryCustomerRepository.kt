package com.bootstrap.service.infrastructure.framework.customer.repositories

import com.bootstrap.service.application.dtos.CustomerResult
import com.bootstrap.service.domain.customer.repositories.CustomerRepository

class InMemoryCustomerRepository: CustomerRepository {
    override fun findAll(): List<CustomerResult> = listOf(
        CustomerResult()
    )

}