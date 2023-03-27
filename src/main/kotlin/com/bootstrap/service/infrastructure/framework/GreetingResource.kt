package com.bootstrap.service.infrastructure.framework

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource {

    private val helloValueToReturn = "Hello from RESTEasy Reactive"
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {

        return helloValueToReturn
    }

    fun hello2(): String = helloValueToReturn


}
