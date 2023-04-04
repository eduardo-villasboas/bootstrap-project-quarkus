package com.bootstrap.service.infrastructure.framework

import com.bootstrap.service.application.CustomerCrudUseCases
import com.bootstrap.service.application.dtos.CustomerResult
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("customers")
class CustomerController(
    private val customerCrudUseCases: CustomerCrudUseCases
) {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun get(): List<CustomerResult> = customerCrudUseCases.findAll()

}
