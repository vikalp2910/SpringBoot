package edu.vikson.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaProducer.class);

    private KafkaTemplate<String,String> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(User data){
        LOGGER.info("======MESSAGE SENT======="+data.toString());
        Message<User> message= MessageBuilder.withPayload(data).
                setHeader(KafkaHeaders.TOPIC,"JsonKafkaTopic")
                .build();

        kafkaTemplate.send(message);
    }
}
