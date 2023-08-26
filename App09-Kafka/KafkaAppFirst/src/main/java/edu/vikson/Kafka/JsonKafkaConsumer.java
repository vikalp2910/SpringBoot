package edu.vikson.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "JsonKafkaTopic", groupId = "MyGroup2")
    public void consume(User user){
        LOGGER.info("========message get========="+user.toString());
    }

}
