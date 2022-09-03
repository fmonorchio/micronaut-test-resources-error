package com.example.core.kafka

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaClient
interface MessageKafkaClient {

    @Topic('messages')
    void send(@KafkaKey String key, String message)

}
