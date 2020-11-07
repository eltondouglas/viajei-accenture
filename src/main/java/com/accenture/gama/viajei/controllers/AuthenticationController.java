package com.accenture.gama.viajei.controllers;

import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AuthenticationController {
    @ApiOperation("Login.")
    @PostMapping("login")
    public void login(@RequestBody Credential credentials) {
        throw new IllegalStateException(
                "This method shouldn't be called. It's implemented by Spring Security filters.");
    }

    @ApiOperation("Logout.")
    @PostMapping("logout")
    public void logout() {
        throw new IllegalStateException(
                "This method shouldn't be called. It's implemented by Spring Security filters.");
    }
}
