package net.geektop.account.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import net.geektop.account.dto.UserInfoDTO;
import net.geektop.account.user.model.entity.UserEntity;

import java.util.Optional;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.service.impl
 * @date 2020/1/13 23:56
 */
public interface IUserService extends IService<UserEntity> {
  Optional<UserEntity> findUserById(Long userId);
  Optional<UserEntity> findUserByName(String name);
  boolean checkIfUserNameExists(String userName);
  boolean addUser(UserInfoDTO userInfoDTO);
}
