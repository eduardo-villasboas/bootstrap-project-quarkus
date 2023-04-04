package com.bootstrap.service.domain.customer.repositories

import com.bootstrap.service.application.dtos.CustomerResult

interface CustomerRepository {

    fun findAll(): List<CustomerResult>

}