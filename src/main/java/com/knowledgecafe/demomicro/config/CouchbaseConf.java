package com.knowledgecafe.demomicro.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@RefreshScope
@EnableCouchbaseRepositories(basePackages = {"com.knowledgecafe.demomicro.model"})
public class CouchbaseConf extends AbstractCouchbaseConfiguration {

    @Value("${db.couchbase.username}")
    private String username;
    @Value("${db.couchbase.password}")
    private String password;
    @Value("${couchbaseip.value}")
    private String ip;

    @Override
    public String getConnectionString() {
        return "couchbase://"+ip;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return "travel-sample";
    }

}