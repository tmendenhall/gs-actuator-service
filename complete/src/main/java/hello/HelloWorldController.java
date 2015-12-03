package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<?> sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template,name));
        return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
    }

}
