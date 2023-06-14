package com.knowledgecafe.demomicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = CouchbaseDataAutoConfiguration.class)
public class DemomicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomicroApplication.class, args);
	}

}
