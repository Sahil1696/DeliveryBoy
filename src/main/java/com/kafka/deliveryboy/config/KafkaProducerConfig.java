package com.kafka.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaProducerConfig {
    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("random-number-topic")
                .replicas(0)
                .partitions(0)
                .build();
    }
}
