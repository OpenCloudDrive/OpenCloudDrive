package net.geektop.account.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.geektop.account.user.model.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.mapper
 * @date 2020/1/13 23:55
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

  @Select("SELECT * FROM users WHERE name = #{name}")
  Optional<UserEntity> findByUserName(String name);

  @Select("SELECT name FROM users WHERE name iLIKE #{name}")
  String CheckIfNameExists(String name);
}
