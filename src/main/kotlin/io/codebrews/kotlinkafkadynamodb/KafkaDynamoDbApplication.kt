package io.codebrews.kotlinkafkadynamodb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class KafkaDynamoDbApplication

fun main(args: Array<String>) {
	runApplication<KafkaDynamoDbApplication>(*args)
}
