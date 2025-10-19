package com.example.paygenius;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Disable CSRF protection, which is not needed for a stateless REST API
                .csrf(csrf -> csrf.disable())
                // Define authorization rules
                .authorizeHttpRequests(auth -> auth
                        // Allow all requests to any URL starting with /api/
                        .requestMatchers("/api/**").permitAll()
                        // Any other request not matching the above rule needs to be authenticated
                        .anyRequest().authenticated()
                )
                // Configure basic authentication with default settings
                .httpBasic(withDefaults());

        return http.build();
    }
}
