package com.example.kotlin.C000A_CSRF

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
class C000A_CSRF_GOOD : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity) {
        http.csrf()

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
}
