package io.dev.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "my-topic", groupId = "my-new-group" )
    public static void listen(String message) {
        System.out.println("Received Message: " + message);
    }

    @KafkaListener(topics = "my-topic-new", groupId = "my-new-group-1" )
    public static void listenUser(User user) {
        System.out.println("Received User details: " + user.toString());
    }
}
