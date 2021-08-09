package com.example.demo.digasset;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DigAssetConfig {

    // 55m0s on MP4
    @Bean
    CommandLineRunner commandLineRunner(DigAssetRepository repository) {
        return args -> {

            /*DigAsset tmp = new DigAsset (
                    101L,
                    LocalDate.of(1700, 1, 3),
                    "The Field",
                    "A modern depiction",
                    "0X9012");
            */
            DigAsset monalisa = new DigAsset(
                    5L,
                    LocalDate.of(1983, 3, 1),
                    "The smile that brought wars",
                    "Mona Lisa",
                    "0X29F8",
                    "Elon"

            );

            /*
            DigAsset nightcafe = new DigAsset(
                    931L,
                    LocalDate.of(1383, 12, 1),
                    "Draw in the streets of Paris",
                    "Night Cafe",
                    "0X99A1",
                    "Mr Art"

            );
            */

            //    55m58s
            repository.save(monalisa);

           //repository.saveAll(List.of(puk, toy));

        };



    }
}
