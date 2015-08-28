/**
 * Created by Grinyov Vitaliy on 28.08.15.
 *
 * Стартер приложения
 *
 * Подымает сервер и запускает веб приложение
 *
 */
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
