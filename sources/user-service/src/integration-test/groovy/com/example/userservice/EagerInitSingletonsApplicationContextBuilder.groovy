package com.example.userservice

import io.micronaut.context.DefaultApplicationContextBuilder

class EagerInitSingletonsApplicationContextBuilder extends DefaultApplicationContextBuilder {

    EagerInitSingletonsApplicationContextBuilder() {
        eagerInitSingletons(true)
    }

}
