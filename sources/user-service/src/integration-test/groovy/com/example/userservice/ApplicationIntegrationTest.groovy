package com.example.userservice

import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.AutoCleanup
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest(contextBuilder = EagerInitSingletonsApplicationContextBuilder)
class ApplicationIntegrationTest extends Specification {

    @AutoCleanup
    @Inject
    @Subject
    EmbeddedServer server

    def 'Should be up and running'() {

        expect:
        server.running
    }

}
