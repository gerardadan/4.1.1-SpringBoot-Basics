package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HelloWorld2")
public class HelloWorldController {

    @GetMapping
    public String greet(@RequestParam(name = "name", required = false, defaultValue = "") String name) {
        return "Hello, " + name + ". You are executing Maven project with method /HelloWorld2";
    }

    @GetMapping("/myname")
    public String greet2(@RequestParam(name = "name", required = false, defaultValue = "") String name) {
        return "Hello, " + name + ". You are executing Maven project with method /HelloWorld2/myname";
    }
}
