package org.example.cicdtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String temp() {
        return "이게되네 CICD 딸깍으로 완료!";
    }
}
