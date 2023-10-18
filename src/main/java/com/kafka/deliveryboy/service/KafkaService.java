package com.kafka.deliveryboy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public Boolean locationUpdate(String location){
       kafkaTemplate.send("random-number-topic",location);
       System.out.println("Message Produced .......");
        return true;
    }
}
