package com.example.okta2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
public class Okta2Application {

    public static void main(String[] args) {
        SpringApplication.run(Okta2Application.class, args);
    }

    /*@RestController
    static class SimpleController{
        @GetMapping
        String welcome(@AuthenticationPrincipal OidcUser principal){
            return "Hello, " + principal.getFullName();
        }
    }*/

}
