Kafka Spring Boot Producer & Consumer
This is a high-performance messaging microservice built with Spring Boot 4.0.2 and Spring Kafka 4.0.2, utilizing Kafka Clients 4.1.1. It demonstrates a full-duplex communication flow: producing JSON messages to a topic and consuming them using a listener.

🏗 Architecture
The application is split into two logical components (or two separate services, as indicated by your io.dev.producer and io.dev.consumer packages):

Producer: Exposes a REST endpoint that triggers a KafkaTemplate to send JSON payloads.

Consumer: Uses @KafkaListener to asynchronously process incoming records.

🛠 Prerequisites
Java 21 or higher

Maven 3.9+

Kafka Broker: Running on localhost:9092

Dependencies: Jackson Databind (for JSON serialization)