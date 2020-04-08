package net.geektop.account.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.geektop.account.user.mapper.APIAuthMapper;
import net.geektop.account.user.model.entity.APIAuthEntity;
import net.geektop.account.user.service.IAPIAuthService;
import org.springframework.stereotype.Service;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.service.impl
 * @date 2020/3/27 02:55
 */
@Service
public class APIAuthServiceImpl extends ServiceImpl<APIAuthMapper, APIAuthEntity> implements IAPIAuthService {
}
