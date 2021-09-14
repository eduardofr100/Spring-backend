package com.example.springbackend.employees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Eduardo FR", true, "viajes", 50000, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Brayan Gay", true, "viajes", 10000, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Raul LG", true, "viajes", 5400, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Marco J FR", true, "viajes", 100000, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Carmen HR", false, "viajes", 6000, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Daniel MC", true, "viajes", 100, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Pablo LC", true, "viajes", 10, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Hector CH", true, "viajes", 1000, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Alejandro CB", true, "viajes", 45000, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Alejandro CH", false, "viajes", 890000, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Javier FR", true, "viajes", 10500, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Juan LC", true, "viajes", 11000, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Maria FR", true, "viajes", 19000, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Carlos OM", false, "viajes", 10670, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Edgar RD", false, "viajes", 10900, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Helaman ZV", true, "viajes", 100, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Ana yeli BD", true, "viajes", 16700, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Alberto AF", false, "viajes", 10450, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Diego FF", true, "viajes", 59100, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Cristian FC", false, "viajes", 2300, "12-09-2021")));
            log.info("Preloading " + repository.save(new Employee("Angel AA", false, "viajes", 13400, "12-09-2021")));
        };
    }
}
