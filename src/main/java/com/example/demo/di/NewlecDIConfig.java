package com.example.demo.di;

import com.example.demo.di.entity.Exam;
import com.example.demo.di.entity.NewlecExam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.example.demo.di.ui")
@Configuration
public class NewlecDIConfig {

    @Bean
    public Exam exam(){
        return new NewlecExam();
    }
}
