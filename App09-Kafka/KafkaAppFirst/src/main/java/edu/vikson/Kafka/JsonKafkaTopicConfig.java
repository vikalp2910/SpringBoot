package edu.vikson.Kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class JsonKafkaTopicConfig {
    @Bean
    public NewTopic topic(){
       return TopicBuilder.name("JsonKafkaTopic").build();
   }
}
