package com.example.core.kafka

import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener
class MessageKafkaListener {

    @Topic('messages')
    void receive(@KafkaKey String key, String message) {
        println("${key} -> Got '${message}'")
    }

}
