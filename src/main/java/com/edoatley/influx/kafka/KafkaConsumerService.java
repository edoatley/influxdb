package com.edoatley.influx.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private final Logger logger =
            LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "${spring.kafka.consumer.topic}")
    public void consume(String message) {
        logger.info(String.format("Message received -> %s", message));
    }
}
