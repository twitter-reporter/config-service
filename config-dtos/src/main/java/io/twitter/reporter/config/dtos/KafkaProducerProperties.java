package io.twitter.reporter.config.dtos;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("twitter.reporter.kafka-hq.kafka-producer")
public class KafkaProducerProperties {

    private String keySerializerClass;
    private String valueSerializerClass;
    private String compressionType;
    private String acks;
    private int batchSize;
    private int batchSizeBoostFactor;
    private int lingerMs;
    private int requestTimeoutMs;
    private int retryCount;
}
