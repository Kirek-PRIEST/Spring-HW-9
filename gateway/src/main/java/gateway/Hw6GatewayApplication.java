package gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Hw6GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(Hw6GatewayApplication.class, args);
    }
}