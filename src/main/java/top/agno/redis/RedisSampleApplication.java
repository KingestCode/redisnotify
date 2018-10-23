package top.agno.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "top.agno.redis")
public class RedisSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSampleApplication.class, args);
    }
}
