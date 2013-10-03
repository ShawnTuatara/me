package ca.tuatara.me;

import org.springframework.boot.SpringApplication;

import ca.tuatara.me.web.config.WebConfig;

public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(WebConfig.class, args);
    }
}
