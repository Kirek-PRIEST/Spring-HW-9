package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Hw6EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(Hw6EurekaApplication.class, args);
    }
}