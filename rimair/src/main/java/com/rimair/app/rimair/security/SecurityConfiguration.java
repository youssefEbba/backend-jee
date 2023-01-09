package com.rimair.app.rimair.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Autowired
    private CustomUserDetailsService customUserDetailsService;
    @Bean
    AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider
                 = new DaoAuthenticationProvider();
        provider.setUserDetailsService(customUserDetailsService);
    provider.setPasswordEncoder(new BCryptPasswordEncoder());
        return  provider;
    }
    // @Bean
    // public PasswordEncoder getPasswordEncoder() {
    //     return NoOpPasswordEncoder.getInstance();
    // }

@Bean
protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
   http.authorizeRequests()
                           .antMatchers("/","/login","/signup")
                            .permitAll()
                            .antMatchers("/users" ,"/vols**")
                            .hasAuthority("ADMIN")
                            .anyRequest()
                            .authenticated()
                            .and()
                            .httpBasic()
                            .and()
                            .csrf().disable();
return http.build();
}
}
