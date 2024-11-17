package com.example.week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1Application implements CommandLineRunner {

    final
    CakeBacker cakeBacker;

    public Week1Application(CakeBacker cakeBacker) {
        this.cakeBacker = cakeBacker;
    }

    public static void main(String[] args){
        SpringApplication.run(Week1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(cakeBacker.bakeCake());
    }
}
