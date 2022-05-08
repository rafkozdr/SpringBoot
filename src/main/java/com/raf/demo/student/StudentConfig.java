package com.raf.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.DECEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student(
                    "Miriam",
                    "mima@gmail.com",
                    LocalDate.of(1999, APRIL, 15)
        );
            Student raf = new Student(
                    "Raf",
                    "raf@gmail.com",
                    LocalDate.of(1996, DECEMBER, 3)

            );

            repository.saveAll(
                    List.of(miriam, raf)
            );
        };
    }
}
