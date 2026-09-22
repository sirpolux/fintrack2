package com.project.fintrack2.config;


import com.project.fintrack2.filters.JwtFilter;
import com.project.fintrack2.service.CustomUserDetailsService;
//import com.study.springsecurity.filters.JwtFilter;
//import com.study.springsecurity.service.CustomUserDetailsService;
//import com.study.springsecurity.utility.Utility;
import com.project.fintrack2.utility.Utility;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig
{

    private final CustomUserDetailsService userDetailsService;
    private final JwtFilter filter;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity, JwtFilter jwtFilter){

        return httpSecurity.csrf(customizer->customizer.disable())  //disables csrf
        .authorizeHttpRequests(request->
                request.requestMatchers("/api/v1/users","/api/auth")
                        .permitAll()
                        .anyRequest()
                        .authenticated()) //ensures that every request is authenticated.
//        .formLogin(Customizer.withDefaults())  //enables or login
        .httpBasic(Customizer.withDefaults())  //enables postman login or login via api
        .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
                .build();
       // return httpSecurity.build();
    }



    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
        provider.setPasswordEncoder(Utility.encoder);
        return provider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config){
        return  config.getAuthenticationManager();
    }


}
