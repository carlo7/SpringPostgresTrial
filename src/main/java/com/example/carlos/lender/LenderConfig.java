package com.example.carlos.lender;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LenderConfig {
    @Bean
    CommandLineRunner commandLineRunner(LenderRepo repo){
        return args ->{
            Lender carlos= new Lender(
                    1L,
                    "Otieno",
                    "Carlos",
                    30_000,
                    15_000
            );
            Lender brigel= new Lender(
                    1L,
                    "Ochieng",
                    "brigel",
                    200_000,
                    5_000
            );
            Lender emeka= new Lender(
                    1L,
                    "Emeka",
                    "Chukwu",
                    20_000,
                    15_000

            );
            repo.saveAll(List.of(carlos,brigel,emeka));

        };

    }
}
