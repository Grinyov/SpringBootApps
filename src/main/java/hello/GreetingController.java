package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Grinyov Vitaliy on 28.08.15.
 *
 * Контроллер приветствия
 *
 * Позволяет получить тект приветствия
 * Аннотация RestController указывает что используется технология rest и возвращяет данные
 *  в формате json
 *
 */
@RestController
public class GreetingController {

    private  static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
