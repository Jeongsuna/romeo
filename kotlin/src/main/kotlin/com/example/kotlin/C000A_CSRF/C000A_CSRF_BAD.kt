package com.example.kotlin.C000A_CSRF

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
class C000A_CSRF_BAD : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity) {
        http
                .authorizeRequests()
                //We need to allow anonymous users to
                //access the login page (otherwise we get 403)
                .antMatchers("/login").anonymous()
                .anyRequest().authenticated()
                .and()
                //Setup a custom login page
                .formLogin()
                .loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
                .httpBasic()
    }


    override fun configure(auth: AuthenticationManagerBuilder) {
        //Sets up a user store in memory. Useful for debugging and development
        auth
                .inMemoryAuthentication()
                .withUser("joe")
                .password("black")
                .roles("USER")
                .and()
                .withUser("administrator")
                .password("administrator")
                .roles("USER", "ADMINISTRATOR")
    }
}