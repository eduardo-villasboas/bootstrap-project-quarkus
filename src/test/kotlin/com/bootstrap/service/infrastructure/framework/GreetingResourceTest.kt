package com.bootstrap.service.infrastructure.framework

import com.bootstrap.service.infrastructure.framework.GreetingResource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GreetingResourceTest {

    @Test
    fun testHelloEndpoint() {
        val greetingResource = GreetingResource()
        val helloResult = greetingResource.hello2()
        assertThat(
            helloResult
        ).isEqualTo(
            "Hello from RESTEasy Reactive"
        )

    }

}