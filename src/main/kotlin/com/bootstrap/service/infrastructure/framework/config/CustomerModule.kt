package com.bootstrap.service.infrastructure.framework.config

import com.bootstrap.service.application.CustomerCrudUseCases
import com.bootstrap.service.domain.customer.repositories.CustomerRepository
import com.bootstrap.service.infrastructure.framework.customer.repositories.InMemoryCustomerRepository
import javax.inject.Singleton

@Singleton
class CustomerModule {

    @Singleton
    fun customerRepository(): CustomerRepository = InMemoryCustomerRepository()

    @Singleton
    fun customerCrudUseCases(customerRepository: CustomerRepository) =
        CustomerCrudUseCases(customerRepository)


}