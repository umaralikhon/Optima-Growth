package com.example.kafkatest;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "myapp.kafka")
@Data
public class Properties {
    private String myKafkaTest;
}
