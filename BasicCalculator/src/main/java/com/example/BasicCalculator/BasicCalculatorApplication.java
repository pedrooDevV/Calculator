package com.example.BasicCalculator;

import com.example.BasicCalculator.Principal.Calculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicCalculatorApplication implements CommandLineRunner {

	public static void main(String[] args) throws IllegalAccessException {
        Calculator.menuCalc();
		// SpringApplication.run(BasicCalculatorApplication.class, args);

	}

    @Override
    public void run(String... args) throws Exception {

    }
}
