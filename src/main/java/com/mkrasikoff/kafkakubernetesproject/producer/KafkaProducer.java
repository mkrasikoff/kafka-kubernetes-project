package com.mkrasikoff.kafkakubernetesproject.producer;

import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topicName = "test_topic";

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {

        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {

        kafkaTemplate.send(topicName, message);
    }
}
