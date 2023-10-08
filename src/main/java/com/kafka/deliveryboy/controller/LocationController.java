package com.kafka.deliveryboy.controller;

import com.kafka.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/update")
public class LocationController {
    @Autowired
    KafkaService kafkaService;
    @PostMapping("/location")

    public ResponseEntity<HttpStatus> locationUpdate(){
        kafkaService.locationUpdate("( "+Math.random()*1000 +", "+Math.random()+" )");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
