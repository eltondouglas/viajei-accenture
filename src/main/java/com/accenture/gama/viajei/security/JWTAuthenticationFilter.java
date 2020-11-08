package com.accenture.gama.viajei.security;

import static com.auth0.jwt.algorithms.Algorithm.HMAC512;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auth0.jwt.JWT;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * This filter by default responds to the URL /login.
 */
public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private AuthenticationManager authenticationManager;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    /**
     * Get username and poassword request in login page and verify authentication
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
            throws AuthenticationException {
        try {
            JsonObject creds = JsonParser.parseReader(req.getReader()).getAsJsonObject();
            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(creds.get("username").getAsString(),
                    creds.get("password").getAsString(), Collections.emptyList()));
        } catch (IOException e) {
            throw new BadCredentialsException(e.getMessage());
        }
    }

    /** */
    @Override
    protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse response, FilterChain chain,
            Authentication auth) throws IOException, ServletException {
        User user = (User) auth.getPrincipal();
        // Parse Roles to token
        List<String> rolesList = new ArrayList<>();
        user.getAuthorities().stream().forEach(authority -> rolesList.add(authority.getAuthority()));
        // Create token
        String token = JWT.create().withSubject(user.getUsername()).withClaim("auths", rolesList)
                .withExpiresAt(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME))
                .sign(HMAC512(SecurityConstants.SECRET.getBytes()));
        // Add Header to response
        response.addHeader(SecurityConstants.HEADER_STRING, SecurityConstants.TOKEN_PREFIX + token);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException failed) throws IOException, ServletException {
        response.getWriter().append("Authentication failure");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    }

}