package org.shepherd.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author niuzhiwei
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.*"})
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
        System.out.println(
                "   _____ _    _  _____ _____ ______  _____ _____ \n" +
                        "  / ____| |  | |/ ____/ ____|  ____|/ ____/ ____|\n" +
                        " | (___ | |  | | |   | |    | |__  | (___| (___  \n" +
                        "  \\___ \\| |  | | |   | |    |  __|  \\___ \\\\___ \\ \n" +
                        "  ____) | |__| | |___| |____| |____ ____) |___) |\n" +
                        " |_____/ \\____/ \\_____\\_____|______|_____/_____/ \n");
    }

}