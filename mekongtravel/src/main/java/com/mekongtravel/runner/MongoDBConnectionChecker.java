package com.mekongtravel.runner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
@Component
public class MongoDBConnectionChecker implements CommandLineRunner {

    private final MongoTemplate mongoTemplate;

    public MongoDBConnectionChecker(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) {
        try {
            mongoTemplate.getDb();
            System.out.println("Connected to MongoDB successfully!");
        } catch (Exception e) {
            System.err.println("Failed to connect to MongoDB: " + e.getMessage());
        }
    }
}
