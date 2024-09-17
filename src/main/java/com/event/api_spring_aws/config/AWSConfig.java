package com.event.api_spring_aws.config;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {

    @Value("${aws.region}")
    private String awsRegion;

    public AmazonS3 createS3Instance() {
        return AmazonS3ClientBuilder
                .standard()
                .withRegion(awsRegion)
                .build();
    }
}
