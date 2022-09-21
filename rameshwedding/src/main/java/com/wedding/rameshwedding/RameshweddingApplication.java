package com.wedding.rameshwedding;

import com.wedding.rameshwedding.guests.GuestMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RameshweddingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RameshweddingApplication.class, args);
    }

    @Bean
    public GuestMapper getMapper(){
        return new GuestMapper();
    }


}



