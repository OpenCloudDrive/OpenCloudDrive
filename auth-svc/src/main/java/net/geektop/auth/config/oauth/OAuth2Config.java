package net.geektop.auth.config.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.auth.config.oauth
 * @date 2020/3/31 15:52
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {
  private DataSource dataSource;

//  @Autowired
//  public OAuth2Config(DataSource dataSource) {
//    this.dataSource = dataSource;
//  }
//
//  @Bean
//  public JdbcTokenStore tokenStore(DataSource dataSource) {
//    return new JdbcTokenStore(dataSource);
//  }

  @Override
  public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
    super.configure(security);
  }

  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    super.configure(clients);
  }

  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    super.configure(endpoints);
  }
}
