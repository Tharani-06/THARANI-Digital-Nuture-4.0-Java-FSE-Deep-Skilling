package com.example.jwt_auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Optional: applies security to all paths
                .securityMatcher("/**")

                // Disable CSRF (for stateless APIs like JWT)
                .csrf(csrf -> csrf.disable())

                // Authorization rules
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/authenticate").permitAll() // Public endpoint
                        .anyRequest().authenticated() // Everything else needs authentication
                );

        return http.build();
    }
}
