package com.bta.demo.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Optional.ofNullable;

@RestController
public class HelloResource {

    @GetMapping("/greeting")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hello " + ofNullable(name).orElse("world");
    }
}
