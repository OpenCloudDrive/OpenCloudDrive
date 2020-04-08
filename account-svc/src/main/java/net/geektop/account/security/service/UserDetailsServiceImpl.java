package net.geektop.account.security.service;

import net.geektop.account.security.model.UserDetailsImpl;
import net.geektop.account.user.mapper.LocalAuthMapper;
import net.geektop.account.user.mapper.UserMapper;
import net.geektop.account.user.model.entity.LocalAuthEntity;
import net.geektop.account.user.model.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.security.service
 * @date 2020/3/18 21:47
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  UserMapper userMapper;
  LocalAuthMapper localAuthMapper;

  @Autowired
  public UserDetailsServiceImpl(UserMapper userMapper, LocalAuthMapper localAuthMapper) {
    this.userMapper = userMapper;
    this.localAuthMapper = localAuthMapper;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    final Optional<UserEntity> userOptional = userMapper.findByUserName(username);
    userOptional.orElseThrow(() -> new UsernameNotFoundException(username));
    final UserEntity userEntity = userOptional.get();
    final LocalAuthEntity localAuthEntity = localAuthMapper.getLocalAuthByUserId(userEntity.getId());

    return new UserDetailsImpl(userEntity, localAuthEntity);
  }
}
