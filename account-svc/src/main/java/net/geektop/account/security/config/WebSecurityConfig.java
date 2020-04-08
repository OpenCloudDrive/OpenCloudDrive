package net.geektop.account.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.security.config
 * @date 2020/1/22 12:31
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      .authorizeRequests()
        .mvcMatchers("/swagger-ui.html", "/webjars/**", "/swagger-resources/**", "/v2/api-docs/**", "/").permitAll()
        .mvcMatchers("/api/user/**").permitAll()
      .anyRequest().authenticated();
  }

  @Bean
  public PasswordEncoder getPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
