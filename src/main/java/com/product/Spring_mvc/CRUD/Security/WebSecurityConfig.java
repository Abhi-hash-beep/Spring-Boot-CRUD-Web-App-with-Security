package com.product.Spring_mvc.CRUD.Security;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authz -> authz
                // Allow public access to static resources, home, registration, and product list
                .requestMatchers("/", "/register", "/saveUser", "/css/**", "/js/**", "/products").permitAll()
                // All other requests need to be authenticated
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login") // Custom login page
                .loginProcessingUrl("/perform_login")
                .defaultSuccessUrl("/products", true) // Redirect to products list after login
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout") // Redirect to login page after logout
                .permitAll()
            );
        return http.build();
    }
}