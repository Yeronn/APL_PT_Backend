package com.aplbackend.pruebaTecnica.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

  // @Bean
  // public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
  //   return httpSecurity
  //                     .csrf(csrf -> csrf.disable())
  //                     .httpBasic(Customizer.withDefaults())
  //                     .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
  //                     .authorizeHttpRequests(http -> {
  //                       //Configurar endPoints publicos
  //                       http.requestMatchers(HttpMethod.GET, "/usuarios/activos").permitAll();

  //                       //Configurar endPointsPrivados
  //                       http.requestMatchers(HttpMethod.GET, "/ventas/listar").hasAuthority("CREATE");

  //                       // Configurar resto de endpoints 
  //                       http.anyRequest().denyAll();
  //                     })   
  //                     .build();
  // }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    return httpSecurity
                      .csrf(csrf -> csrf.disable())
                      .httpBasic(Customizer.withDefaults())
                      .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                      .build();
  }


  @Bean
  public AuthenticationManager authenticationManager( AuthenticationConfiguration authenticationConfiguration) throws Exception {
    return authenticationConfiguration.getAuthenticationManager();
  }

  @Bean
  public AuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
    provider.setPasswordEncoder(passwordEncoder());
    provider.setUserDetailsService(null);
    return provider;
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }

}
