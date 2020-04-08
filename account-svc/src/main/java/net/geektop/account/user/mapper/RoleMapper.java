package net.geektop.account.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.geektop.account.user.model.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.mapper
 * @date 2020/3/27 02:47
 */
@Repository
@Mapper
public interface RoleMapper extends BaseMapper<RoleEntity> {
}
