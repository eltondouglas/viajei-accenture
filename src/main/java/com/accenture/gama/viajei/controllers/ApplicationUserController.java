package com.accenture.gama.viajei.controllers;

import javax.validation.Valid;

import com.accenture.gama.viajei.model.ApplicationUser;
import com.accenture.gama.viajei.service.ApplicationUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
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

    @ApiOperation(value = "Find user by email")
    @ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header")
    @GetMapping("/search/email")
    public ResponseEntity<ApplicationUser> findByUsername(@Valid @RequestParam String email) {
        return ResponseEntity.ok(applicationUserService.getUserRepository().findByUsername(email));
    }
}