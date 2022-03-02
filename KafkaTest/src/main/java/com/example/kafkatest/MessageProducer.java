package com.example.kafkatest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Slf4j
@Component
public class MessageProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final Properties props;
    private String topic = props.getMyKafkaTest();

    public void sendMessage(String message){
        log.info("MESSAGE SENT FROM PRODUCER: " + message);
        kafkaTemplate.send(topic, message);
    }
}
