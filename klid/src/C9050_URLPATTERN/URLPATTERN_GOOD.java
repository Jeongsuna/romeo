package C9050_URLPATTERN;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class URLPATTERN_GOOD {
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
      .antMatchers("/admin/login").permitAll()
      .antMatchers("/admin/**").hasRole("ADMIN") // Compliant
      .antMatchers("/user/**").access("hasRole('ADMIN') and hasRole('DBA')")
      .antMatchers("/**", "/home").permitAll() // Compliant; "/**" is the last one
      .and().formLogin().loginPage("/login").permitAll().and().logout().permitAll();
  }
}

