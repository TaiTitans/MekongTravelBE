package com.mekongtravel.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.mekongtravel.repository")
public class MongoConfig extends AbstractMongoClientConfiguration{
@Override
    protected String getDatabaseName(){
    return "mekongtravel";
}
}

