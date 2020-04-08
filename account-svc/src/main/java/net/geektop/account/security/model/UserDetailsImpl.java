package net.geektop.account.security.model;

import net.geektop.account.user.model.entity.LocalAuthEntity;
import net.geektop.account.user.model.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.security.model
 * @date 2020/3/18 21:27
 */
public class UserDetailsImpl implements UserDetails {

  private String userName;
  private String password;
  private List<GrantedAuthority> authorityList;

  public UserDetailsImpl(UserEntity userEntity, LocalAuthEntity localAuthEntity) {
    this.userName = userEntity.getName();
    this.password = localAuthEntity.getPassword();
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return userName;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
