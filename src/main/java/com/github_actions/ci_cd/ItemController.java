package com.github_actions.ci_cd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ItemController {

    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping("/items")
    public List<String> items() {
        return Arrays.asList("item1", "item2");
    }
}
