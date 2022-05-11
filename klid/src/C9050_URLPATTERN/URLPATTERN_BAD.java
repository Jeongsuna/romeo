package C9050_URLPATTERN;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class URLPATTERN_BAD {
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
      .antMatchers("/admin/**").hasRole("ADMIN")
      .antMatchers("/admin/login").permitAll() // Noncompliant; the pattern "/admin/login" should appear before "/admin/**"
      .antMatchers("/**", "/home").permitAll()
      .antMatchers("/user/**").access("hasRole('ADMIN') and hasRole('DBA')") // Noncompliant; the pattern "/db/**" should occurs before "/**"
      .and().formLogin().loginPage("/login").permitAll().and().logout().permitAll();
  }
}

