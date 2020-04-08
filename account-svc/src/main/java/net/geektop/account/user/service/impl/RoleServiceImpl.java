package net.geektop.account.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.geektop.account.user.mapper.RoleMapper;
import net.geektop.account.user.model.entity.RoleEntity;
import net.geektop.account.user.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.service.impl
 * @date 2020/3/27 03:00
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements IRoleService {
}
