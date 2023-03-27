package com.bootstrap.service.infrastructure.framework

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.junit.jupiter.api.Test

@QuarkusTest
class GreetingResourceComponentTest {

    @Test
    fun testHelloEndpointOnComponentContext() {
        //TODO: When I to implement a restassured test drop this test.

        given()
          .`when`().get("/hello1")
          .then()
             .statusCode(404)
             //.body(`is`("Hello from RESTEasy Reactive"))
    }

}