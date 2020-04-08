package net.geektop.account.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.geektop.account.user.mapper.UserRoleMapper;
import net.geektop.account.user.model.entity.UserRoleEntity;
import net.geektop.account.user.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.service.impl
 * @date 2020/3/27 03:01
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleEntity> implements IUserRoleService {
}
