package net.geektop.account.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.geektop.account.user.mapper.LocalAuthMapper;
import net.geektop.account.user.model.entity.LocalAuthEntity;
import net.geektop.account.user.service.ILocalAuthService;
import org.springframework.stereotype.Service;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.service.impl
 * @date 2020/3/27 02:57
 */
@Service
public class LocalAuthServiceImpl extends ServiceImpl<LocalAuthMapper, LocalAuthEntity> implements ILocalAuthService {
}
