package com.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;


@Configuration
public class LibraryEvenConsumerConfig {

	@KafkaListener(topics= {"order-topic","payment-topic"},groupId = "library-events-listener-groups")
	public void onMessage(ConsumerRecord<Integer, String> record) {
		
		System.out.println("Consumer Records"+record);
		System.out.println("Key: " + record.key() + ", Value: " + record.value());
		


	}


}
