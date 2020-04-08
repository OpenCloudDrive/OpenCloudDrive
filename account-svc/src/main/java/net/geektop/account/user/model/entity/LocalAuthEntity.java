package net.geektop.account.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.model.entity
 * @date 2020/2/21 01:20
 */
@TableName(value = "local_auth")
@Getter
@Setter
public class LocalAuthEntity {
  private Long id;
  private Long userId;
  private String password;

  @TableLogic
  @TableField(select = false)
  private Boolean isActive;
}
