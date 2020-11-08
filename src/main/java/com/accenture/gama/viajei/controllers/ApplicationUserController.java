package com.accenture.gama.viajei.controllers;

import javax.validation.Valid;

import com.accenture.gama.viajei.model.ApplicationUser;
import com.accenture.gama.viajei.service.ApplicationUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/users")
@Api(description = "Operations pertaining to user")
public class ApplicationUserController {

    @Autowired
    private ApplicationUserService applicationUserService;

    @PostMapping("/sign-up")
    @ApiOperation(value = "Sign-up user")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void signUp(@Valid @RequestBody ApplicationUser user) {
        this.applicationUserService.create(user);
    }

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