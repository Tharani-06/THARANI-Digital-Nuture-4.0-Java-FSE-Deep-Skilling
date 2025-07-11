package com.example.jwt_auth.controller;

import com.example.jwt_auth.util.SpringJwtApplication;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class JwtAuthenticationController {

    @GetMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(decodedBytes, StandardCharsets.UTF_8);
            String[] values = credentials.split(":", 2);

            String username = values[0];
            String password = values[1];

            if ("user".equals(username) && "pwd".equals(password)) {
                String token = SpringJwtApplication.generateToken(username);
                return ResponseEntity.ok("{\"token\":\"" + token + "\"}");
            }
        }

        return ResponseEntity.status(401).body("Unauthorized");
    }
}
