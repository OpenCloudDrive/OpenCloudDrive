package net.geektop.account.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.geektop.account.user.model.entity.LocalAuthEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.mapper
 * @date 2020/3/18 22:35
 */
@Repository
@Mapper
public interface LocalAuthMapper extends BaseMapper<LocalAuthEntity> {

  @Select("SELECT * FROM local_auth WHERE user_id = #{userId}")
  LocalAuthEntity getLocalAuthByUserId(Long userId);

}
