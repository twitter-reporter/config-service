package io.twitter.reporter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Data
@Configuration
@ConfigurationProperties("twitter.reporter.kafka-hq.kafka-admin")
public class KafkaAdminProperties {

    private String bootstrapServers;

    private String schemaRegistryUrlKey;

    private String schemaRegistryUrl;

    private String topicName;

    private Set<String> topicNamesToCreate;

    private int partitionsCount;

    private short replicationFactor;

}
