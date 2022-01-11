package misha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Neil Alishev
 */
@Controller
public class HelloController {

    @GetMapping("/hello-World")
    public String sayHello() {
        return "hello_World";
    }
}