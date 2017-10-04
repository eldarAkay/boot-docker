package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path = "/api")
public class Application {

    @RequestMapping("/test")
    public String home() {
        return "App works";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
