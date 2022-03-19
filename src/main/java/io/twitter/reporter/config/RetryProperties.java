package io.twitter.reporter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties("twitter.reporter.retry-config")
public class RetryProperties {

    private long initialIntervalInMs;

    private long maxIntervalInMs;

    private double multiplier;

    private int maxAttempts;

    private long sleepTimeInMs;

}
