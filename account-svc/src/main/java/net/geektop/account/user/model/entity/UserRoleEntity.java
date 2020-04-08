package net.geektop.account.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.model.entity
 * @date 2020/3/27 01:26
 */
@Data
@TableName(value = "user_role")
public class UserRoleEntity {
  private Long id;
  private Long userId;
  private Integer roleId;
}
