package io.codebrews.kotlinkafkadynamodb

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding


@ConstructorBinding
@ConfigurationProperties(prefix="application.kafka")
data class KafkaConfigProperties(
        val broker: String,
        val serializer: String,
        val desrializer: String,
        val schemaRegistryUrl: String,
        val createUserRequestTopic: String,
        val userCreatedEventTopic: String
)
