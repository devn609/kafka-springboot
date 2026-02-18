package io.dev.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/producer")
public class KafkaProducer {
//    private final KafkaTemplate<String, String> msgTemplate;
//    public KafkaProducer(KafkaTemplate<String, String> msgTemplate) {
//        this.msgTemplate = msgTemplate;
//    }
//    @PostMapping("/sendmessage")
//    public String send_message(@RequestParam String message) {
//        String topic = "my-topic";
//
//        msgTemplate.send(topic,  message);
//        return "Message Sent:" + message;
//    }

    private final KafkaTemplate<String, User> userTemplate;

    public KafkaProducer(KafkaTemplate<String, User> userTemplate) {
        this.userTemplate = userTemplate;
    }

    @PostMapping("/send")
    public String send_user(@RequestParam String message) {
        String topic = "my-topic-new";

        User user = new User( 100, "Mike", "mike@example.com", "982983298");
        userTemplate.send(topic,  user);
        return "(user) Message Sent:" + user.toString();
    }

    @PostMapping("/senduser")
    public String send_userobject(@RequestBody User user) {
        String topic = "my-topic-new";
        System.out.println( "HERE :" + topic);
        System.out.println( user);
        userTemplate.send(topic,  user);
        return "(User) Message Sent:" + user.toString();
    }

}
