# springboot-kafka
Rigth now, I'm learning about more apache kafka conceps with spring boot in java

## kafka commands on Windows

Start zookeeper

    .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start Kafka server

    .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Create a topic on Kafka

    .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic streams-plaintext-input
    
    .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic streams-wordcount-output


List all topics

    .\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --list

write on topic Kafka
    
    .\bin\windows\kafka-console-producer.bat --broker-list 127.0.0.1:9092 --topic strems-plaintext-input

Read the data of a topic kafka

    .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic streams-plaintext-input --from-beginning

List my class kafka

    .\bin\windows\kafka-run-class.bat org.apache.kafka.streams.examples.wordcount.WordCountDemo
