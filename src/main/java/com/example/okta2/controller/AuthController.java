package com.example.okta2.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    @GetMapping
    String welcome(@AuthenticationPrincipal OidcUser principal) {
        System.out.printf("token", principal.getIdToken());
        System.out.printf("userInfo", principal.getUserInfo());
        return "Hello, " + principal.getFullName();
    }

}
