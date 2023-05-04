package com.batch.spring.batch.config.steps;

import com.batch.spring.batch.config.tasklets.HelloWorldTasklet;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class FirstStep {

    @Bean
    public Step step(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step", jobRepository)
                .tasklet((new HelloWorldTasklet()), transactionManager)
                .build();
    }


}
