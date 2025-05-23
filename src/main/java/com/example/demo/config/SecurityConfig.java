//package com.example.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//  @Bean
//  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//    http.authorizeHttpRequests(auth -> auth
//                    .requestMatchers("/users/**").permitAll()
//                    .requestMatchers("/admin/**").hasRole("ADMIN"))
//
//            .formLogin(from -> from.loginPage("/login").permitAll());
//
//    return http.build();
//  }
//
//  @Bean
//  public InMemoryUserDetailsManager userDetailsManager() {
//    UserDetails user = User.withDefaultPasswordEncoder()
//            .username("user")
//            .password("password")
//            .build();
//
//    UserDetails admin = User.withDefaultPasswordEncoder()
//            .username("admin")
//            .password("password")
//            .roles("ADMIN")
//            .build();
//    return new InMemoryUserDetailsManager(user, admin);
//
//  }
//}
