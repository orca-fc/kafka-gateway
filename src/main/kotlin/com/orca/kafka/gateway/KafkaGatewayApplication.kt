package com.orca.kafka.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaGatewayApplication

suspend fun main(args: Array<String>) {
	runApplication<KafkaGatewayApplication>(*args)
}
