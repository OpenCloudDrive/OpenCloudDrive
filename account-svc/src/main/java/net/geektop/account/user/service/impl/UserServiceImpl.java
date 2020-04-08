package net.geektop.account.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.dozermapper.core.Mapper;
import net.geektop.account.dto.UserInfoDTO;
import net.geektop.account.user.mapper.LocalAuthMapper;
import net.geektop.account.user.model.entity.LocalAuthEntity;
import net.geektop.account.user.model.entity.UserEntity;
import net.geektop.account.user.mapper.UserMapper;
import net.geektop.account.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.service.impl
 * @date 2020/1/13 23:57
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {
  private UserMapper userMapper;
  private Mapper mapper;
  private LocalAuthMapper localAuthMapper;

  @Autowired
  public UserServiceImpl(UserMapper userMapper, Mapper mapper, LocalAuthMapper localAuthMapper) {
    this.userMapper = userMapper;
    this.mapper = mapper;
    this.localAuthMapper = localAuthMapper;
  }

  @Override
  public Optional<UserEntity> findUserById(Long userId) {
    return Optional.empty();
  }

  @Override
  public Optional<UserEntity> findUserByName(String name) {
    return userMapper.findByUserName(name);
  }

  @Override
  public boolean checkIfUserNameExists(String userName) {
    final String name = userMapper.CheckIfNameExists(userName);
    return name == null;
  }

  @Override
  public boolean addUser(UserInfoDTO userInfoDTO) {
    final UserEntity userEntity = mapper.map(userInfoDTO, UserEntity.class);
    final boolean save = this.save(userEntity);

    // TODO: encrypt password
    final LocalAuthEntity localAuthEntity = mapper.map(userInfoDTO, LocalAuthEntity.class);
    final int insertNum = localAuthMapper.insert(localAuthEntity);

    return save && insertNum == 1;
  }
}
