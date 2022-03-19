package io.twitter.reporter.config.dtos;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties("twitter.reporter.twifka")
public class TwifkaProperties {

    private List<String> twitterKeywords;

}
