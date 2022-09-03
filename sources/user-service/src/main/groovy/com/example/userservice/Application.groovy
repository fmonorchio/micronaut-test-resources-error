package com.example.userservice

import io.micronaut.runtime.Micronaut

class Application {

    static void main(String[] args) {

        Micronaut.build(args)
                .banner(false)
                .bootstrapEnvironment(true)
                .eagerInitConfiguration(true)
                .start()
    }

}
