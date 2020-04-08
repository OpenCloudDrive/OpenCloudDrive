package net.geektop.account.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.model.entity
 * @date 2020/3/27 01:22
 */
@Data
@TableName(value = "role")
public class RoleEntity {
  private Integer id;
  private String name;
  private Integer parentId;
}
