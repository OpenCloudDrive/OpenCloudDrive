package net.geektop.account.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.geektop.account.user.mapper.OAuthMapper;
import net.geektop.account.user.model.entity.OAuthEntity;
import net.geektop.account.user.service.IOAuthService;
import org.springframework.stereotype.Service;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.service.impl
 * @date 2020/3/27 02:58
 */
@Service
public class OAuthServiceImpl extends ServiceImpl<OAuthMapper, OAuthEntity> implements IOAuthService {
}
