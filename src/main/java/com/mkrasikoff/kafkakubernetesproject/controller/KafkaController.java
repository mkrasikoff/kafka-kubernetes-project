package com.mkrasikoff.kafkakubernetesproject.controller;

import com.mkrasikoff.kafkakubernetesproject.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
    }
}
