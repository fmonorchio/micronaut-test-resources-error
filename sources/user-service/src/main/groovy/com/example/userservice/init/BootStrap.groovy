package com.example.userservice.init

import io.micronaut.context.annotation.Context
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.event.annotation.EventListener

@Context
class BootStrap {

    @EventListener
    final void onStartup(StartupEvent event) {
    }

}
